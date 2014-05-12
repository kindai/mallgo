package com.mallgo.rest;

import com.google.gson.Gson;
import com.mallgo.common.RestUtil;
import com.mallgo.domain.Product;
import com.mallgo.persistence.AccountMapper;
import com.mallgo.persistence.CategoryMapper;
import com.mallgo.service.AccountService;
import com.mallgo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.io.UnsupportedEncodingException;

/**
 * Created by kin on 5/11/14.
 */
@Component
@Path("/product")
public class ProductRestBean {

    @Autowired
    private ProductService productService;

    @GET
    @Path("/")
    @Produces("application/json")
    public String hello(){
        return "hello world";
    }

    @GET
    @Path("/get_product_by_name/{name}/{tokenCode}")
    @Produces("application/json")
    public Response getProductByName(@PathParam("name")String name, @PathParam("tokenCode") String tokenCode, @QueryParam("zip") Boolean compressed,  @QueryParam("s") String salt,
                                     @Context UriInfo uriInfo, @Context HttpServletResponse response) throws UnsupportedEncodingException {

        RestUtil restUtil = new RestUtil();

        if(!restUtil.isValidToken(tokenCode, salt)){
            return Response.status(HttpServletResponse.SC_FORBIDDEN).entity("").build();
        }
        Product product = productService.getProductByName(name);
        String jsonIds = new Gson().toJson(product);
        if(Boolean.FALSE.equals(compressed)){
            return Response.status(HttpServletResponse.SC_OK).entity(jsonIds).build();
        }

        return Response.status(HttpServletResponse.SC_OK).entity(restUtil.zipTextBase64(jsonIds)).build();

    }

}
