package com.loivis.javalab.resources.aws;

import com.loivis.javalab.api.aws.s3.S3Object;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("s3")
@Produces(MediaType.APPLICATION_JSON)
public class S3 {

    @GET
    @Path("{bucket}/{objectKey}")
    public S3Object getObject(@PathParam("bucket") String bucket, @PathParam("objectKey") String objectKey) {
        return new S3Object(bucket, objectKey);
    }

}
