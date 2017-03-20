package com.loivis.javalab.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Properties;

public class SystemProperties {

    private Properties properties;

    @JsonProperty
    public Properties getProperties() {
        this.properties = System.getProperties();
        return this.properties;
    }

}
