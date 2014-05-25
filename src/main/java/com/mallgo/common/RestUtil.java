/**
 * Copyright © 2006, 2013, Oracle and/or its affiliates. All rights reserved.
 */

package com.mallgo.common;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.core.MediaType;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.UUID;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * @author Alex Li xin.h.li@oracle.com
 *         Helper to call RESTful web service
 */
public class RestUtil {
    private static final String IDENTITY = "MALL_REST";
    private static final String DELIMITER = "/";
    private static final Logger LOG = LoggerFactory.getLogger(RestUtil.class);
    private static final String SALT_PARAM_KEY = "s";
    private static final Client CLIENT = Client.create();

    public String getJSON(String url) {
        String urlWithHashAndParam = enableZip(addMd5Hash(url));
        LOG.debug(urlWithHashAndParam);
        WebResource webResource = CLIENT.resource(urlWithHashAndParam);
        try {
            ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON_TYPE)
                    .get(ClientResponse.class);
            if (response.getStatus() != 200) {
                LOG.error("REST webservice api call failed with url: " + urlWithHashAndParam + " response status is: " + response.getStatus());
                throw new RuntimeException("REST webservice api call failed with url: " + urlWithHashAndParam);
            }
            String json = response.getEntity(String.class);
            LOG.debug(json);
            return json;
        } catch (RuntimeException ex) {
            LOG.error("REST webservice api call failed with url: " + urlWithHashAndParam, ex);
        }
        return "";
    }

    public String postJSON(String url, String json) {
        WebResource webResource = CLIENT.resource(url);
        try {
            LOG.debug(json);
            ClientResponse response = webResource.type(MediaType.APPLICATION_JSON)
                    .accept(MediaType.APPLICATION_JSON)
                    .post(ClientResponse.class, json);
            if (response.getStatus() != 202) {
                LOG.error("REST webservice api call failed with url: " + url + " response status is: " + response.getStatus());
                throw new RuntimeException("REST webservice api call failed with url: " + url);
            }
            String resp = response.getEntity(String.class);
            LOG.debug(resp);
            return resp;
        } catch (RuntimeException ex) {
            LOG.error("REST webservice api call failed with url: " + url, ex);
        }
        return "";
    }

    String enableZip(String url) {
        return addParam(url, "zip", "true");
    }

    public String addParam(String url, String key, String value) {
        String paramDelimiter = url.contains("?") ? "&" : "?";
        return url + paramDelimiter + key + "=" + value;
    }

    public List<String> decodeJson(String json) {
        Gson gson = new Gson();
        Type listType = new TypeToken<List<String>>() {}.getType();
        return gson.fromJson(json, listType);
    }

    public String getMD5Hash(String salt) {
        try {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.reset();
            m.update((IDENTITY + salt).getBytes("UTF-8"));
            return new String(Hex.encodeHex(m.digest()));
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            LOG.error("Error generate MD5 hash.", e);
        }
        return "";
    }

    public String randomSalt() {
        return UUID.randomUUID().toString();
    }

     String addMd5Hash(String url) {
         if (url == null || url.isEmpty()) {
             throw new IllegalStateException("Illegal url string: " + url);
         }
         String salt = randomSalt();
         String newUrl = url + (url.endsWith(DELIMITER) ? "" : DELIMITER) + getMD5Hash(salt);
         return addParam(newUrl, SALT_PARAM_KEY, salt);
     }

    public static String decodeAndUnzip(String encodedJson) throws IOException {
        byte[] zippedInfo = Base64.decodeBase64(encodedJson.getBytes("UTF-8"));
        ByteArrayInputStream zippedByte = new ByteArrayInputStream(zippedInfo);
        byte[] unziped = unzip(zippedByte);
        return new String(unziped, "UTF-8");
    }

    public static byte[] unzip(ByteArrayInputStream zippedByte) throws IOException {
        ByteArrayOutputStream dest = new ByteArrayOutputStream();
        GZIPInputStream zip = new GZIPInputStream(zippedByte);
        try {
            int count;
            byte data[] = new byte[1024];
            while ((count = zip.read(data)) > 0) {
                dest.write(data, 0, count);
            }
        } catch (IOException e) {
            LOG.error("Error unzip input stream. ", e);
            throw e;
        } finally {
            dest.flush();
            dest.close();
            zip.close();
        }
        return dest.toByteArray();
    }

    public String zipTextBase64(String text) throws UnsupportedEncodingException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Base64 base64 = new Base64();
        try{
            GZIPOutputStream gzip = new GZIPOutputStream(out);
            gzip.write(text.getBytes("UTF-8"));
            gzip.close();
        }catch(Exception ex){
            //zip error
        }
        String zipStr = new String(base64.encode(out.toByteArray()),"UTF-8");
        return zipStr;

    }

    public boolean isValidToken(String tokenCode, String salt){
        if(tokenCode.isEmpty() || salt.isEmpty()){
            return false;
        }
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.reset();
            md5.update((IDENTITY + salt).getBytes("UTF-8"));
            String md5Encoded = new String(Hex.encodeHex(md5.digest()));
            return tokenCode.equals(md5Encoded);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return false;
    }
}