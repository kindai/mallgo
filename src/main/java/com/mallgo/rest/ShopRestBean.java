package com.mallgo.rest;

import com.google.gson.Gson;
import com.mallgo.common.RestUtil;
import com.mallgo.model.*;
import com.mallgo.persistence.ShopMapper;
import com.mallgo.persistence.ShopPicMapper;
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

    @Autowired
    private ShopPicMapper shopPicMapper;

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
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateShop(Shop shop,
                               @Context UriInfo uriInfo, @Context HttpServletResponse response) throws UnsupportedEncodingException, SQLException {

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

        return Response.status(HttpServletResponse.SC_ACCEPTED).entity(shop).build();

    }

    @GET
    @Path("/shop_pic/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPic(@PathParam("name")String name, @PathParam("tokenCode") String tokenCode, @QueryParam("zip") Boolean compressed,  @QueryParam("s") String salt,
                           @Context UriInfo uriInfo, @Context HttpServletResponse response) throws UnsupportedEncodingException, SQLException {

        ShopExample shopExample = new ShopExample();
        shopExample.createCriteria().andNameEqualTo(name);
        List<Shop> shops = shopMapper.selectByExample(shopExample);
        if(shops.size() < 0)
            throw new SQLException();
        else{
            ShopPicExample shopPicExample = new ShopPicExample();
            shopPicExample.createCriteria().andShopIdEqualTo(shops.get(0).getId());
            List<ShopPic> shopPics = shopPicMapper.selectByExample(shopPicExample);
            return Response.status(HttpServletResponse.SC_OK).entity(shopPics).build();
        }

    }

    @POST
    @Path("/shop_pic/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addPic(ShopPic shopPic,
                               @Context UriInfo uriInfo, @Context HttpServletResponse response) throws UnsupportedEncodingException, SQLException {

        shopPicMapper.insertSelective(shopPic);
        return Response.status(HttpServletResponse.SC_ACCEPTED).entity(shopPic).build();

    }

}
