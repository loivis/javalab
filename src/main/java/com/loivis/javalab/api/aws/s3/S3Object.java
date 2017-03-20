package com.loivis.javalab.api.aws.s3;

import com.fasterxml.jackson.annotation.JsonProperty;

public class S3Object {

    private String bucket;
    private String objectKey;
    private String objectContent;

    public S3Object(String bucket, String objectKey) {
        this.bucket = bucket;
        this.objectKey = objectKey;
        this.objectContent = getObjectContent();
    }

    @JsonProperty
    public String getBucket() {
        return bucket;
    }

    @JsonProperty
    public String getObjectKey() {
        return objectKey;
    }

    @JsonProperty

    public String getObjectContent() {
        this.objectContent = this.bucket + "-" + this.objectKey;
        return objectContent;
//        AmazonS3 s3client = AmazonS3ClientBuilder.defaultClient();
    }

}
