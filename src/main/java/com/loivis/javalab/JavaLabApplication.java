package com.loivis.javalab;

import com.loivis.javalab.resources.PrintProperties;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class JavaLabApplication extends Application<JavaLabConfiguration> {

    public static void main(final String[] args) throws Exception {
        new JavaLabApplication().run(args);
    }

    @Override
    public String getName() {
        return "JavaLab";
    }

    @Override
    public void initialize(final Bootstrap<JavaLabConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final JavaLabConfiguration configuration,
                    final Environment environment) {
        final PrintProperties systemProperties = new PrintProperties();
        environment.jersey().register(systemProperties);
    }

}
