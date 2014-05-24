package com.mallgo.rest;

import com.google.gson.Gson;
import com.mallgo.common.RestUtil;
import com.mallgo.model.Item;
import com.mallgo.model.User;
import com.mallgo.model.UserExample;
import com.mallgo.persistence.ItemMapper;
import com.mallgo.persistence.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by kin on 5/24/14.
 */
@Component
@Path("/user")
public class UserRestBean {
    @Autowired
    private UserMapper userMapper;

    @GET
    @Path("/get_user_by_name/{name}/{tokenCode}")
    @Produces("application/json")
    public Response getUserByName(@PathParam("name")String name, @PathParam("tokenCode") String tokenCode, @QueryParam("zip") Boolean compressed,  @QueryParam("s") String salt,
                                  @Context UriInfo uriInfo, @Context HttpServletResponse response) throws UnsupportedEncodingException {

        RestUtil restUtil = new RestUtil();

        int kin1=0;

        if(!restUtil.isValidToken(tokenCode, salt)){
            return Response.status(HttpServletResponse.SC_FORBIDDEN).entity("").build();
        }
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(name);
        List<User> users = userMapper.selectByExample(userExample);
        String jsonIds = new Gson().toJson(users);
        if(Boolean.FALSE.equals(compressed)){
            return Response.status(HttpServletResponse.SC_OK).entity(jsonIds).build();
        }

        return Response.status(HttpServletResponse.SC_OK).entity(restUtil.zipTextBase64(jsonIds)).build();

    }

    @GET
    @Path("/get_user_by_name/{name}/{tokenCode}")
    @Produces("application/json")
    public Response saveUser(@PathParam("name")String name, @PathParam("tokenCode") String tokenCode, @QueryParam("zip") Boolean compressed,  @QueryParam("s") String salt,
                                  @Context UriInfo uriInfo, @Context HttpServletResponse response) throws UnsupportedEncodingException {

        RestUtil restUtil = new RestUtil();

        if(!restUtil.isValidToken(tokenCode, salt)){
            return Response.status(HttpServletResponse.SC_FORBIDDEN).entity("").build();
        }
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(name);
        List<User> users = userMapper.selectByExample(userExample);
        String jsonIds = new Gson().toJson(users);
        if(Boolean.FALSE.equals(compressed)){
            return Response.status(HttpServletResponse.SC_OK).entity(jsonIds).build();
        }

        return Response.status(HttpServletResponse.SC_OK).entity(restUtil.zipTextBase64(jsonIds)).build();

    }
}
