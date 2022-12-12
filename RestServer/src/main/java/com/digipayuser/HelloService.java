package com.digipayuser;


import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/users")
public class HelloService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response greetClient(){
        String output="Hi " + " vahid";
        return Response.status(200).entity(output).build();

    }


}

