package com.atom.scenario;

import com.atom.ApplicationContext;
import com.atom.bean.CriticalError;
import com.atom.bean.json.login.LoginResponse;
import com.atom.builders.RequestBuilder;
import com.atom.common.RequestType;
import com.atom.common.StringUtils;
import com.atom.interfaces.Configuration;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public abstract class AbstractScenario {

    protected final Configuration configuration;
    protected final RequestBuilder requestBuilder;
    protected final Gson gson;

    public AbstractScenario() {
        configuration = ApplicationContext.getInstance().getConfiguration();
        requestBuilder = ApplicationContext.getInstance().getRequestBuilder();
        gson = new GsonBuilder().create();
    }

    public abstract void doScenario();

    public void doLogin() {
        String responseStr = requestBuilder.buildRequest(RequestType.LOGIN);
        if (StringUtils.isNotEmpty(responseStr)) {
            LoginResponse loginResponse = gson.fromJson(responseStr, LoginResponse.class);
            try {
                String key = loginResponse.getData().getKey();
                if (StringUtils.isEmpty(key)) {
                    throw new CriticalError("Cannot read \"key\" param at login");
                }
                configuration.getLoginData().setKey(key);
            } catch (NullPointerException exc) {
                throw new CriticalError("Cannot process login response");
            }
        }
    }
}
