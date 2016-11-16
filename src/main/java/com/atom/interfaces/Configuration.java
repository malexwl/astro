package com.atom.interfaces;

import com.atom.bean.LoginData;

public interface Configuration {

    boolean TEST_WAR_SCENARIO = false;
    byte TEST_CAMPAIGN_GIFT_NUMBER = 1;
    byte TEST_LANG_NUMBER = 3;
    String TEST_USER_LOGIN_UUID = "14400589853300001";
    String TEST_USER_LOGIN_GID = "100765982588173617754";
    String TEST_USER_LOGIN_TOKEN_WORK = "ya29.CjOXA73QTUQxYZsPCc5nRGvN4zdxD9-jpRPwbq5ZcXjvVFI0BpypXqsJgr_Uge66efei_fs";
    String TEST_USER_LOGIN_TOKEN_HOME = "ya29.CjOWA-bohg7J9MY84IGoZ0TPrQzH_rj-_G1Rbfv4j2bLmw_0I7HM4GItIyryFpZ-HJRwB8U";
    String TEST_USER_EXTERNAL_ID_BLACK = "323707";
    short TEST_VERSION = 2500;
    short TEST_AREA_ID = 109;
    short TEST_R_ID = 1;

    String URL_LOGIN = "http://login.beginning.astronest.com/ck2glo_php/_login_lib/_login_ggl.php";
    //    http://game1.beginning.astronest.com/ck2glo_php/_content/empire_status.php?eid=323707&rc=A01200&key=6482310&version=2500&time_xxx=1479138343
    String URL_STATUS = "http://game1.beginning.astronest.com/ck2glo_php/_content/empire_status.php";
    //    http://game1.beginning.astronest.com/ck2glo_php/_content/empire_start.php?eid=323707&rc=A01120&key=6482310&version=2500&time_xxx=1479138344
    String URL_START = "http://game1.beginning.astronest.com/ck2glo_php/_content/empire_start.php";
    //    http://game1.beginning.astronest.com/ck2glo_php/_content/notice_read.php?eid=323707&lang=3&rc=A11300&key=6482310&version=2500&time_xxx=1479138346
    String URL_READ = "http://game1.beginning.astronest.com/ck2glo_php/_content/notice_read.php";
    //    http://game1.beginning.astronest.com/ck2glo_php/_content/racewar_info.php?eid=323707&rc=A07010&key=3887&version=2500&time_xxx=1479138579
    String URL_WAR = "http://game1.beginning.astronest.com/ck2glo_php/_content/racewar_info.php";
    //    http://game1.beginning.astronest.com/ck2glo_php/_content/recomm_list.php?eid=323707&rc=A07200&key=3887&version=2500&time_xxx=1479138585
    String URL_REFRESH = "http://game1.beginning.astronest.com/ck2glo_php/_content/recomm_list.php";
    //    http://game1.beginning.astronest.com/ck2glo_php//_content/war_info2.php?eid=323707&tid=131989&rc=A07000&key=3887&version=2500&time_xxx=1479138593
    String URL_SELECT_WAR = "http://game1.beginning.astronest.com/ck2glo_php//_content/war_info2.php";

//Campaign
//    http://game1.beginning.astronest.com/ck2glo_php/_content//adventure_status.php?eid=323707&rc=A17000&key=9345534&version=2500&time_xxx=1479243132
    String URL_ADVENTURE_STATUS = "http://game1.beginning.astronest.com/ck2glo_php/_content//adventure_status.php";
//    http://game1.beginning.astronest.com/ck2glo_php/_content//adventure_start.php?eid=323707&area_id=109&rc=A17001&key=9345534&version=2500&time_xxx=1479243140
String URL_ADVENTURE_SELECT = "http://game1.beginning.astronest.com/ck2glo_php/_content//adventure_start.php";
//    http://game1.beginning.astronest.com/ck2glo_php//_content/formation_info.php?eid=323707&rc=A05021&key=9345534&version=2500&time_xxx=1479243085
String URL_ADVENTURE_FORMATION_INFO = "http://game1.beginning.astronest.com/ck2glo_php//_content/formation_info.php";
//    http://game1.beginning.astronest.com/ck2glo_php/_content//adventure_end.php?eid=323707&rc=A17002&key=9345534&version=2500&time_xxx=1479243103
String URL_ADVENTURE_ATTACK = "http://game1.beginning.astronest.com/ck2glo_php/_content//adventure_end.php";
    //    http://game1.beginning.astronest.com/ck2glo_php//_content/adventure_reward.php?eid=323707&r_id=1&rc=A17003&key=9345534&version=2500&time_xxx=1479243121
String URL_ADVENTURE_REWARD = "http://game1.beginning.astronest.com/ck2glo_php//_content/adventure_reward.php";

    boolean isWarScenario();

    boolean isCampaignScenario();

    byte getNumberOfCampaignGiftSelection();

    LoginData getLoginData();

    short getVersion();
}
