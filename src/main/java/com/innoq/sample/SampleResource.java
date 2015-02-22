package com.innoq.sample;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/sample")
public class SampleResource {

    @Inject
    SampleBean bean;

    @GET
    @Produces("text/html")
    @Path("/")
    public String printHelloWorld() {
        return bean.getMessage();
    }
}
