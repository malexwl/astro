package com.atom.scenario;

import com.atom.ApplicationContext;
import com.atom.bean.CriticalError;
import com.atom.bean.json.login.LoginResponse;
import com.atom.builders.RequestBuilder;
import com.atom.common.NetworkHelper;
import com.atom.common.RequestType;
import com.atom.common.StringUtils;
import com.atom.interfaces.Configuration;
import com.atom.interfaces.Scenario;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public abstract class AbstractScenario implements Scenario{

    protected final Configuration configuration;
    protected final RequestBuilder requestBuilder;
    protected final Gson gson;

    public AbstractScenario() {
        configuration = ApplicationContext.getInstance().getConfiguration();
        requestBuilder = ApplicationContext.getInstance().getRequestBuilder();
        gson = new GsonBuilder().create();
    }

    public void doLoginRequest() {
        String url = requestBuilder.buildRequest(RequestType.LOGIN);
        String responseStr = NetworkHelper.sendGetRequest(url);
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

    /*
    Return to main view
     */
    public void doStatusRequest() {
        String url = requestBuilder.buildRequest(RequestType.STATUS);
        NetworkHelper.sendGetRequest(url);
    }

    public void doStartRequest() {
        String url = requestBuilder.buildRequest(RequestType.START);
        NetworkHelper.sendGetRequest(url);
    }

    public void doReadRequest() {
        String url = requestBuilder.buildRequest(RequestType.READ);
        NetworkHelper.sendGetRequest(url);
    }
}
