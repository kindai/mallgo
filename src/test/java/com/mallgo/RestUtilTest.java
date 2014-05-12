/**
 * Copyright © 2006, 2013, Oracle and/or its affiliates. All rights reserved.
 */

package com.mallgo;

import com.google.gson.Gson;
import com.mallgo.common.RestUtil;
import junit.framework.Assert;
import org.junit.Test;

import java.util.List;

public class RestUtilTest {
    @Test
    public void testGetJSON() throws Exception {
        RestUtil restUtil = new RestUtil();
        String json = restUtil.getJSON("http://localhost:8080/rest/product/get_product_by_name/Persian");
        System.out.println(json);
        String s = RestUtil.decodeAndUnzip(json);
        System.out.println(s);
    }

    @Test
    public void test_encode_decode() throws Exception {
        Gson gson = new Gson();
        String[] strings = new String[]{
                "001", "002", "003"
        };
        String jsonStr = gson.toJson(strings);
        System.out.println(jsonStr);
    }

    @Test
    public void test_add_param() {
        String paramed = new RestUtil().addParam("http://foo.bar/", "key", "value");
        Assert.assertEquals("http://foo.bar/?key=value", paramed);
    }

    @Test
    public void test_add_param_when_url_already_has_param() {
        String paramed = new RestUtil().addParam("http://foo.bar?first=001", "key", "value");
        Assert.assertEquals("http://foo.bar?first=001&key=value", paramed);
    }

    @Test
    public void test_zip_unzip() throws Exception {
        System.out.println(System.currentTimeMillis());
        Thread.sleep(3000);
        System.out.println(System.currentTimeMillis());
    }

    @Test
    public void test_randomSalt() {
        RestUtil restUtil = new RestUtil();
        System.out.println(restUtil.randomSalt());
    }

    @Test
    public void test_decodeJson() {
        RestUtil restUtil = new RestUtil();
        List<String> stringList = restUtil.decodeJson("[101,102,103,121,001]");
        Assert.assertEquals(5, stringList.size());
        Assert.assertEquals("101", stringList.get(0));
    }
}
