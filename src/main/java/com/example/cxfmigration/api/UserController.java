package com.example.cxfmigration.api;

import com.example.cxfmigration.model.User;
import io.swagger.annotations.*;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/users")
@Produces({
        MediaType.APPLICATION_JSON + ";charset=utf-8",
        MediaType.APPLICATION_XML + ";charset=utf-8"
})
@Api(value = "Info about users")
public interface UserController {

    @GET
    @ApiOperation(value = "Get all users",
            produces = "application/json,application/xml",
            consumes = "application/json,application/xml"
    )
    @ApiResponses({
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 400, message = "Client Error"),
            @ApiResponse(code = 403, message = "Access Denied"),
            @ApiResponse(code = 500, message = "Server Error")
    })
    List<User> listUsers();

    @GET
    @ApiOperation(value = "Get user by id",
            produces = "application/json,application/xml",
            consumes = "application/json,application/xml"
    )
    @ApiResponses({
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 400, message = "Client Error"),
            @ApiResponse(code = 403, message = "Access Denied"),
            @ApiResponse(code = 500, message = "Server Error")
    })
    @Path("/{user-id}")
    User userById(@ApiParam("Users id") @PathParam("user-id") Integer id);

}
