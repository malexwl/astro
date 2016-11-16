package com.atom.scenario;

import com.atom.common.NetworkHelper;
import com.atom.common.RequestType;

public class ScenarioAdventure extends AbstractScenario{

    public void doScenario() {
        doAdventureStatusRequest();
        doAdventureSelectRequest();
        doAdventureFormationInfoRequest();
        doAdventureAttackRequest();
        doAdventureRewardRequest();
    }

    public void doAdventureStatusRequest() {
        String url = requestBuilder.buildRequest(RequestType.ADVENTURE_STATUS);
        NetworkHelper.sendGetRequest(url);
    }

    public void doAdventureSelectRequest() {
        String url = requestBuilder.buildRequest(RequestType.ADVENTURE_SELECT);
        NetworkHelper.sendGetRequest(url);
    }

    public void doAdventureFormationInfoRequest() {
        String url = requestBuilder.buildRequest(RequestType.ADVENTURE_FORMATION_INFO);
        NetworkHelper.sendGetRequest(url);
    }

    public void doAdventureAttackRequest() {
        String url = requestBuilder.buildRequest(RequestType.ADVENTURE_ATTACK);
        NetworkHelper.sendGetRequest(url);
    }

    public void doAdventureRewardRequest() {
        String url = requestBuilder.buildRequest(RequestType.ADVENTURE_REWARD);
        NetworkHelper.sendGetRequest(url);
    }
}
