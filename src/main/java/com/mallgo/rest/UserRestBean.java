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
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
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
    @Path("/{name}/{tokenCode}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUserByName(@PathParam("name")String name, @PathParam("tokenCode") String tokenCode, @QueryParam("zip") Boolean compressed,  @QueryParam("s") String salt,
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

    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateUser(User user,
                                  @Context UriInfo uriInfo, @Context HttpServletResponse response) throws UnsupportedEncodingException, SQLException {

        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(user.getUsername());
        List<User> users = userMapper.selectByExample(userExample);
        if(users.size() == 1){
            userMapper.updateByExampleSelective(user, userExample);
        }else if(users.size() == 0){
            userMapper.insertSelective(user);
        }else{
            throw new SQLException();
        }

        return Response.status(HttpServletResponse.SC_ACCEPTED).entity(user).build();

    }
}
