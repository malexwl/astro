package com.atom.impl;

import com.atom.bean.LoginData;
import com.atom.interfaces.Configuration;

public class ConfigurationImpl implements Configuration {

    private LoginData loginData;
    private String loginUrl;

    public ConfigurationImpl(LoginData loginData) {
        this.loginData = loginData;
    }


    @Override
    public LoginData getLoginData() {
        return loginData;
    }

    @Override
    public boolean isWarScenario() {
        return TEST_WAR_SCENARIO;
    }

    @Override
    public boolean isCampainScenario() {
        return !TEST_WAR_SCENARIO;
    }

    @Override
    public byte getNumberOfCampainGiftSelection() {
        return TEST_CAMPAIN_GIFT_NUMBER;
    }

    @Override
    public short getVersion() {
        return Configuration.TEST_VERSION;
    }
}
