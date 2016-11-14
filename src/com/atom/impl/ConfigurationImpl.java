package com.atom.impl;

import com.atom.interfaces.Configuration;

public class ConfigurationImpl implements Configuration {
    @Override
    public String getUserId() {
        return null;
    }

    @Override
    public String getUserToken() {
        return null;
    }

    @Override
    public boolean isWarScenario() {
        return false;
    }

    @Override
    public boolean isCampainScenario() {
        return false;
    }

    @Override
    public byte getNumberOfCampainGiftSelection() {
        return 0;
    }

    @Override
    public String getLoginUrl() {
        return null;
    }

    @Override
    public String getStartUrl() {
        return null;
    }

    @Override
    public String getWarUrl() {
        return null;
    }

    @Override
    public String getRefreshUrl() {
        return null;
    }

    @Override
    public String getSelectWarUserUrl() {
        return null;
    }

    @Override
    public String getAttackWarUrl() {
        return null;
    }
}
