package org.example;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {


    private @Inject HelloPrinter helloPrinter;

    public ExampleResource() {

    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return helloPrinter.printHello();
    }
}
