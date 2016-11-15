package com.atom.scenario;

import com.atom.ApplicationContext;
import com.atom.builders.RequestBuilder;
import com.atom.common.RequestType;
import com.atom.interfaces.Configuration;

public abstract class AbstractScenario {

    protected Configuration configuration;
    protected RequestBuilder requestBuilder;

    public AbstractScenario() {
        configuration = ApplicationContext.getInstance().getConfiguration();
        requestBuilder = ApplicationContext.getInstance().getRequestBuilder();
    }

    public abstract void doScenario();

    public void doLogin() {
        String responseStr = requestBuilder.buildRequest(RequestType.LOGIN);

    }
}
