package com.atom.builders;

import com.atom.bean.Pair;
import com.atom.bean.RequestType;
import com.atom.common.Helper;
import com.atom.common.NameConstants;
import com.atom.common.RcConstants;
import com.atom.common.StringUtills;
import com.atom.interfaces.Configuration;

/**
 * Created by atom on 14.11.16.
 */
public class RequestBuilder {

    private Configuration configuration;

    public RequestBuilder(Configuration configuration) {
        this.configuration = configuration;
    }

    public String buildRequest(RequestType type) {
        Pair rcUrlPair = getRcUrlPair(type);
        String rc = rcUrlPair.getKey();
        String url = rcUrlPair.getVal().toString();
        Pair[] params;

        switch (type) {
            case READ:
                params = buildReadParams(rc);
                break;
            default:
                params = buildCommonParams(rc);
        }

        return Helper.generateUrl(url, params);
    }

    private Pair[] buildReadParams(String rc) {
        return new Pair[]{
                getEidPair(),
                getLangPair(),
                getRcPair(rc),
                getKeyPair(),
                getVersionPair(),
                getTimePair()
        };
    }

    private Pair[] buildCommonParams(String rc) {
        return new Pair[]{
                getEidPair(),
                getRcPair(rc),
                getKeyPair(),
                getVersionPair(),
                getTimePair()
        };
    }

    private Pair getVersionPair() {
        return new Pair(NameConstants.P_VERSION, configuration.getVersion());
    }

    private Pair getTimePair() {
        return new Pair(NameConstants.P_TIME_XXX, Helper.getTimeXXX());
    }

    private Pair getRcPair(String rc) {
        return new Pair(NameConstants.P_RC, rc);
    }

    private Pair getRcUrlPair(RequestType type) {
        String rc;
        String url;
        switch (type) {
            case LOGIN:
                rc = RcConstants.LOGIN;
                url = Configuration.URL_LOGIN;
                break;
            case STATUS:
                rc = RcConstants.STATUS;
                url = Configuration.URL_STATUS;
                break;
            case START:
                rc = RcConstants.START;
                url = Configuration.URL_START;
                break;
            case READ:
                rc = RcConstants.READ;
                url = Configuration.URL_READ;
                break;
            case WAR:
                rc = RcConstants.WAR;
                url = Configuration.URL_WAR;
                break;
            case REFRESH_WAR:
                rc = RcConstants.REFRESH;
                url = Configuration.URL_REFRESH;
                break;
            case SELECT_WAR:
                rc = RcConstants.WAR_SELECT;
                url = Configuration.URL_SELECT_WAR;
                break;
            default:
                rc = StringUtills.EMPTY;
                url = StringUtills.EMPTY;
        }
        return new Pair(rc, url);
    }

    private Pair getKeyPair() {
        return new Pair(NameConstants.P_KEY, configuration.getLoginData().getKey());
    }

    private Pair getEidPair() {
        return new Pair(NameConstants.P_EID, configuration.getLoginData().getEid());
    }

    private Pair getLangPair() {
        return new Pair(NameConstants.P_LANG, configuration.TEST_LANG_NUMBER);
    }
}
