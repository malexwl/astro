package com.atom.interfaces;

import com.atom.bean.LoginData;

public interface Configuration {

    boolean TEST_WAR_SCENARIO = false;
    byte TEST_CAMPAIN_GIFT_NUMBER = 1;
    byte TEST_LANG_NUMBER = 3;
    String TEST_USER_LOGIN_UUID = "14400589853300001";
    String TEST_USER_LOGIN_GID = "100765982588173617754";
    String TEST_USER_LOGIN_TOKEN_WORK = "ya29.CjOWAxjh35HX-xdM6h62Y2JyON0f8bpBCK9AG4zMaGWSmuoHH8H2zXZBmNX37BCi1aT4hM0";
    String TEST_USER_LOGIN_TOKEN_HOME = "ya29.CjOWA-bohg7J9MY84IGoZ0TPrQzH_rj-_G1Rbfv4j2bLmw_0I7HM4GItIyryFpZ-HJRwB8U";
    String TEST_USER_EXTERNAL_ID_BLACK = "323707";
    short TEST_VERSION = 2500;

    public static final String URL_LOGIN = "http://login.beginning.astronest.com/ck2glo_php/_login_lib/_login_ggl.php";
    //    http://game1.beginning.astronest.com/ck2glo_php/_content/empire_status.php?eid=323707&rc=A01200&key=6482310&version=2500&time_xxx=1479138343
    public static final String URL_STATUS = "http://game1.beginning.astronest.com/ck2glo_php/_content/empire_status.php?eid=323707&rc=A01200&key=6482310&version=2500&time_xxx=1479138343";
    //    http://game1.beginning.astronest.com/ck2glo_php/_content/empire_start.php?eid=323707&rc=A01120&key=6482310&version=2500&time_xxx=1479138344
    public static final String URL_START = "http://game1.beginning.astronest.com/ck2glo_php/_content/empire_start.php?eid=323707&rc=A01120&key=6482310&version=2500&time_xxx=1479138344";
    //    http://game1.beginning.astronest.com/ck2glo_php/_content/notice_read.php?eid=323707&lang=3&rc=A11300&key=6482310&version=2500&time_xxx=1479138346
    public static final String URL_READ = "http://game1.beginning.astronest.com/ck2glo_php/_content/notice_read.php?eid=323707&lang=3&rc=A11300&key=6482310&version=2500&time_xxx=1479138346";
    //    http://game1.beginning.astronest.com/ck2glo_php/_content/racewar_info.php?eid=323707&rc=A07010&key=3887&version=2500&time_xxx=1479138579
    public static final String URL_WAR = "http://game1.beginning.astronest.com/ck2glo_php/_content/racewar_info.php?eid=323707&rc=A07010&key=3887&version=2500&time_xxx=1479138579";
    //    http://game1.beginning.astronest.com/ck2glo_php/_content/recomm_list.php?eid=323707&rc=A07200&key=3887&version=2500&time_xxx=1479138585
    public static final String URL_REFRESH = "http://game1.beginning.astronest.com/ck2glo_php/_content/recomm_list.php?eid=323707&rc=A07200&key=3887&version=2500&time_xxx=1479138585";
    //    http://game1.beginning.astronest.com/ck2glo_php//_content/war_info2.php?eid=323707&tid=131989&rc=A07000&key=3887&version=2500&time_xxx=1479138593
    public static final String URL_SELECT_WAR = "http://game1.beginning.astronest.com/ck2glo_php//_content/war_info2.php?eid=323707&tid=131989&rc=A07000&key=3887&version=2500&time_xxx=1479138593";



    boolean isWarScenario();
    boolean isCampainScenario();
    byte getNumberOfCampainGiftSelection();

    LoginData getLoginData();
    short getVersion();
}
