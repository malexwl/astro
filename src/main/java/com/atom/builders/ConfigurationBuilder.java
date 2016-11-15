package com.atom.builders;

import com.atom.bean.LoginData;
import com.atom.impl.ConfigurationImpl;
import com.atom.interfaces.Configuration;

public class ConfigurationBuilder {

    public Configuration buildHomeBlack() {
        LoginData loginData = buildLoginData(Configuration.TEST_USER_LOGIN_TOKEN_HOME);
        return new ConfigurationImpl(loginData);
    }

    protected LoginData buildLoginData(String token) {
        return new LoginData(Configuration.TEST_USER_LOGIN_UUID, Configuration.TEST_USER_LOGIN_GID, token);
    }

}
