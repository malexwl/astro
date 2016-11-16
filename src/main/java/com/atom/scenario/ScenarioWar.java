package com.atom.scenario;

import com.atom.common.NetworkHelper;
import com.atom.common.RequestType;

public class ScenarioWar extends AbstractScenario {
    public void doScenario() {
        doWarRequest();
        doWarGetUsersRequest();
        doWarSelectUserRequest();
        doWarAttackRequest();
    }

    public void doWarRequest() {
        String url = requestBuilder.buildRequest(RequestType.WAR);
        NetworkHelper.sendGetRequest(url);
    }

    public void doWarGetUsersRequest() {
        String url = requestBuilder.buildRequest(RequestType.WAR_GET_USERS);
        NetworkHelper.sendGetRequest(url);
    }

    public void doWarSelectUserRequest() {
        // TODO: 16.11.16 need to provide user id in method below
        String url = requestBuilder.buildRequest(RequestType.WAR_SELECT_USER);
        NetworkHelper.sendGetRequest(url);
    }

    public void doWarAttackRequest() {
        // TODO: 16.11.16 need to provide user id in method below
        String url = requestBuilder.buildRequest(RequestType.WAR_ATTACK);
        NetworkHelper.sendGetRequest(url);
    }
}
