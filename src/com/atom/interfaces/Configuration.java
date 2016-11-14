package com.atom.interfaces;

public interface Configuration {

    String getUserId();
    String getUserToken();

    boolean isWarScenario();
    boolean isCampainScenario();
    byte getNumberOfCampainGiftSelection();

    String getLoginUrl();
    String getStartUrl();
    String getWarUrl();
    String getRefreshUrl();
    String getSelectWarUserUrl();
    String getAttackWarUrl();
}
