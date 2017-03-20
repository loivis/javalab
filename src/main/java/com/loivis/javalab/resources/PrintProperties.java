package com.loivis.javalab.resources;

import com.codahale.metrics.annotation.Timed;
import com.loivis.javalab.api.SystemProperties;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("system-properties")
@Produces(MediaType.APPLICATION_JSON)
public class PrintProperties {

    @GET
    @Timed
    public SystemProperties getProperties() {
        return new SystemProperties();
    }
}
