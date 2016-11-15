package com.atom;

import com.atom.builders.ConfigurationBuilder;
import com.atom.builders.RequestBuilder;
import com.atom.interfaces.Configuration;

public class ApplicationContext {

    private static volatile ApplicationContext instance;
    private Configuration configuration;
    private RequestBuilder requestBuilder;

    private ApplicationContext() {
    }

    public static ApplicationContext getInstance() {
        ApplicationContext localInstance = instance;
        if (localInstance == null) {
            synchronized (ApplicationContext.class) {
                if (localInstance == null) {
                    localInstance = new ApplicationContext();
                    Configuration configuration = new ConfigurationBuilder().buildHomeBlack();
                    localInstance.configuration = configuration;
                    localInstance.requestBuilder = new RequestBuilder(configuration);
                    instance = localInstance;
                }
            }
        }
        return localInstance;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public RequestBuilder getRequestBuilder() {
        return requestBuilder;
    }
}
