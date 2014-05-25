package com.mallgo.rest;

import com.google.gson.Gson;
import com.mallgo.common.RestUtil;
import com.mallgo.model.Shop;
import com.mallgo.model.ShopExample;
import com.mallgo.model.User;
import com.mallgo.model.UserExample;
import com.mallgo.persistence.ShopMapper;
import com.mallgo.persistence.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by kindai on 14-5-24.
 */
@Component
@Path("shop")
public class ShopRestBean {
    @Autowired
    private ShopMapper shopMapper;

    @GET
    @Path("/{name}/{tokenCode}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getShopByName(@PathParam("name")String name, @PathParam("tokenCode") String tokenCode, @QueryParam("zip") Boolean compressed,  @QueryParam("s") String salt,
                                  @Context UriInfo uriInfo, @Context HttpServletResponse response) throws UnsupportedEncodingException {

        RestUtil restUtil = new RestUtil();

        if(!restUtil.isValidToken(tokenCode, salt)){
            return Response.status(HttpServletResponse.SC_FORBIDDEN).entity("").build();
        }
        ShopExample shopExample = new ShopExample();
        shopExample.createCriteria().andNameEqualTo(name);
        List<Shop> shops = shopMapper.selectByExample(shopExample);
        String jsonIds = new Gson().toJson(shops);
        if(Boolean.FALSE.equals(compressed)){
            return Response.status(HttpServletResponse.SC_OK).entity(jsonIds).build();
        }

        return Response.status(HttpServletResponse.SC_OK).entity(restUtil.zipTextBase64(jsonIds)).build();

    }

    @POST
    @Path("/{tokenCode}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateShop(Shop shop, @PathParam("tokenCode") String tokenCode, @QueryParam("s") String salt,
                               @Context UriInfo uriInfo, @Context HttpServletResponse response) throws UnsupportedEncodingException, SQLException {

        RestUtil restUtil = new RestUtil();

        if(!restUtil.isValidToken(tokenCode, salt)){
            return Response.status(HttpServletResponse.SC_FORBIDDEN).entity("").build();
        }

        ShopExample shopExample = new ShopExample();
        shopExample.createCriteria().andNameEqualTo(shop.getName());
        List<Shop> shops = shopMapper.selectByExample(shopExample);
        if(shops.size() == 1){
            shopMapper.updateByExampleSelective(shop, shopExample);
        }else if(shops.size() == 0){
            shopMapper.insertSelective(shop);
        }else{
            throw new SQLException();
        }

        return Response.status(HttpServletResponse.SC_OK).build();

    }
}
