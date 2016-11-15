package com.atom.impl;

import com.atom.bean.LoginData;
import com.atom.interfaces.Configuration;

public class ConfigurationImpl implements Configuration {

    private final LoginData loginData;

    public ConfigurationImpl(LoginData loginData) {
        this.loginData = loginData;
    }


    public LoginData getLoginData() {
        return loginData;
    }

    public boolean isWarScenario() {
        return TEST_WAR_SCENARIO;
    }

    public boolean isCampaignScenario() {
        return !TEST_WAR_SCENARIO;
    }

    public byte getNumberOfCampaignGiftSelection() {
        return Configuration.TEST_CAMPAIGN_GIFT_NUMBER;
    }

    public short getVersion() {
        return Configuration.TEST_VERSION;
    }
}
