package com.atom.builders;

import com.atom.bean.Pair;
import com.atom.common.RequestType;
import com.atom.common.Helper;
import com.atom.common.NameConstants;
import com.atom.common.RcConstants;
import com.atom.common.StringUtils;
import com.atom.interfaces.Configuration;

import java.util.ArrayList;
import java.util.List;

public class RequestBuilder {

    private final Configuration configuration;

    public RequestBuilder(Configuration configuration) {
        this.configuration = configuration;
    }

    public String buildRequest(RequestType type) {
        Pair rcUrlPair = getRcUrlPair(type);
        String rc = rcUrlPair.getKey();
        String url = rcUrlPair.getVal().toString();
        List<Pair> params;

        switch (type) {
            case READ:
                params = buildCommonParams(rc, getLangPair());
                break;
            case ADVENTURE_SELECT:
                params = buildCommonParams(rc, getAreaIdPair());
                break;
            case ADVENTURE_ATTACK:
                params = buildCommonParams(rc, getRIdPair());
                break;
            default:
                params = buildCommonParams(rc);
        }

        return Helper.generateUrl(url, params);
    }

    private List<Pair> buildCommonParams(final String rc, Pair... additionalParameters) {
        List<Pair> pairs = new ArrayList<Pair>();
        pairs.add(getEidPair());
        pairs.add(getRcPair(rc));
        pairs.add(getKeyPair());
        pairs.add(getVersionPair());
        pairs.add(getTimePair());

        if (Helper.isNotEmpty(additionalParameters)) {
            for (Pair param : additionalParameters) {
                pairs.add(param);
            }
        }
        return pairs;
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
            case ADVENTURE_STATUS:
                rc = RcConstants.ADVENTURE_STATUS;
                url = Configuration.URL_ADVENTURE_STATUS;
                break;
            case ADVENTURE_SELECT:
                rc = RcConstants.ADVENTURE_SELECT;
                url = Configuration.URL_ADVENTURE_SELECT;
                break;
            case ADVENTURE_FORMATION_INFO:
                rc = RcConstants.ADVENTURE_FORMATION_INFO;
                url = Configuration.URL_ADVENTURE_FORMATION_INFO;
                break;
            case ADVENTURE_ATTACK:
                rc = RcConstants.ADVENTURE_ATTACK;
                url = Configuration.URL_ADVENTURE_ATTACK;
                break;
            case ADVENTURE_REWARD:
                rc = RcConstants.ADVENTURE_REWARD;
                url = Configuration.URL_ADVENTURE_REWARD;
                break;
            default:
                rc = StringUtils.EMPTY;
                url = StringUtils.EMPTY;
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
        return new Pair(NameConstants.P_LANG, Configuration.TEST_LANG_NUMBER);
    }

    private Pair getAreaIdPair() {
        return new Pair(NameConstants.P_AREA_ID, Configuration.TEST_AREA_ID);
    }

    private Pair getRIdPair() {
        return new Pair(NameConstants.P_R_ID, Configuration.TEST_R_ID);
    }
}
