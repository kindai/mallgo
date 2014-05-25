package com.mallgo.rest;

import com.google.gson.Gson;
import com.mallgo.common.RestUtil;
import com.mallgo.model.Product;
import com.mallgo.model.ProductExample;
import com.mallgo.persistence.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by kin on 5/11/14.
 */
@Component
@Path("/product")
public class ProductRestBean {

    @Autowired
    private ProductMapper productMapper;

    @GET
    @Path("/{name}/{tokenCode}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProductByName(@PathParam("name")String name, @PathParam("tokenCode") String tokenCode, @QueryParam("zip") Boolean compressed,  @QueryParam("s") String salt,
                                     @Context UriInfo uriInfo, @Context HttpServletResponse response) throws UnsupportedEncodingException {

        RestUtil restUtil = new RestUtil();

        if(!restUtil.isValidToken(tokenCode, salt)){
            return Response.status(HttpServletResponse.SC_FORBIDDEN).entity("").build();
        }
        List<Product> product = productMapper.selectByExample(null);
        String jsonIds = new Gson().toJson(product);
        if(Boolean.FALSE.equals(compressed)){
            return Response.status(HttpServletResponse.SC_OK).entity(jsonIds).build();
        }

        return Response.status(HttpServletResponse.SC_OK).entity(restUtil.zipTextBase64(jsonIds)).build();

    }

}
