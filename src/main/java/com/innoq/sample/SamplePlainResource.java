package com.innoq.sample;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/plain")
public class SamplePlainResource {

    @GET
    @Produces("text/html")
    @Path("/")
    public String printHelloWorld() {
        return "<h1>Simple answer from Jersey</h1>";
    }
}
