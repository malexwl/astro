package com.atom.builders;

import com.atom.bean.LoginData;
import com.atom.impl.ConfigurationImpl;
import com.atom.interfaces.Configuration;

/**
 * Created by atom on 14.11.16.
 */
public class ConfigurationBuilder {

    public Configuration buildHomeBlack() {
        LoginData loginData = buildLoginData(Configuration.TEST_USER_LOGIN_TOKEN_HOME);
        Configuration configuration = new ConfigurationImpl(loginData);
        return configuration;
    }

    protected LoginData buildLoginData(String token) {
        return new LoginData(Configuration.TEST_USER_LOGIN_UUID, Configuration.TEST_USER_LOGIN_GID, token);
    }

}
