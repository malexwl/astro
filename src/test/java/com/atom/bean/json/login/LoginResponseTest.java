package com.atom.bean.json.login;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class LoginResponseTest {

    public static final String RESPONSE_STRING = "{\"r\":1,\"rc\":\"C01031\",\"err\":\"100\",\"info\":[],\"ntf\":[],\"data\":{\"key\":\"8876378\",\"server_list\":[{\"id\":1,\"name\":\"Libra\",\"addr\":\"http:\\/\\/game1.beginning.astronest.com\",\"status\":1,\"empire_id\":323707,\"number\":403753,\"concur\":73},{\"id\":2,\"name\":\"Aries\",\"addr\":\"http:\\/\\/game2.beginning.astronest.com\",\"status\":1,\"empire_id\":0,\"number\":247642,\"concur\":82},{\"id\":3,\"name\":\"Orion\",\"addr\":\"http:\\/\\/game3.beginning.astronest.com\",\"status\":1,\"empire_id\":0,\"number\":165887,\"concur\":180},{\"id\":4,\"name\":\"Gemini\",\"addr\":\"http:\\/\\/game4.beginning.astronest.com\",\"status\":1,\"empire_id\":0,\"number\":109068,\"concur\":144},{\"id\":5,\"name\":\"Sirius\",\"addr\":\"http:\\/\\/game5.beginning.astronest.com\",\"status\":1,\"empire_id\":0,\"number\":110315,\"concur\":104},{\"id\":6,\"name\":\"Antares\",\"addr\":\"http:\\/\\/game6.beginning.astronest.com\",\"status\":1,\"empire_id\":0,\"number\":112402,\"concur\":160},{\"id\":7,\"name\":\"Scorpion\",\"addr\":\"http:\\/\\/game7.beginning.astronest.com\",\"status\":1,\"empire_id\":118636,\"number\":51283,\"concur\":196}]},\"sub\":0}";
    private static Gson gson;

    @BeforeClass
    public static void init() {
        gson = new GsonBuilder().create();
    }

    @AfterClass
    public static void destroy() {
        gson = null;
    }

    @Test
    public void parseResponse() {
        LoginResponse loginResponse = gson.fromJson(RESPONSE_STRING, LoginResponse.class);
        assertNotNull(loginResponse);
        ServersData data = loginResponse.getData();
        assertNotNull(data);
        String key = data.getKey();
        assertTrue("8876378".equals(key));
    }
}
