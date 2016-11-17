package com.atom.bean.json;

public class Info {

    private User user;
    private Level level;
    private Integer time;
    private Integer level_up;
    private Integer hero_level;

    public User getUser() {
        return user;
    }

    public Level getLevel() {
        return level;
    }

    public Integer getTime() {
        return time;
    }

    public Integer getLevel_up() {
        return level_up;
    }

    public Integer getHero_level() {
        return hero_level;
    }

    // Other classes
    public class User {
        private Integer e_id;
        private Integer r_id;
        private Long u_id;
        private String e_name;
        private Integer credit;
        private Integer isNewbie;
        private Integer planet_num;
        private Integer planet_point;
        private String bonus;
        private Integer fleet_power;
        private Integer allynum;
        private Integer starter;
        private Integer starter2;
        private Integer title;
        private Integer medal_num;
        private Integer dark;
        private Integer produce_power;
        private Integer research_power;
        private Integer conquer;
        private Integer crystal_pack;
        private Integer sponsor;
        private Integer hyper;
        private Integer c_time;
        private Integer hero_num;
        private Integer hero_left_time;

        public Integer getE_id() {
            return e_id;
        }

        public Integer getR_id() {
            return r_id;
        }

        public Long getU_id() {
            return u_id;
        }

        public String getE_name() {
            return e_name;
        }

        public Integer getCredit() {
            return credit;
        }

        public Integer getIsNewbie() {
            return isNewbie;
        }

        public Integer getPlanet_num() {
            return planet_num;
        }

        public Integer getPlanet_point() {
            return planet_point;
        }

        public String getBonus() {
            return bonus;
        }

        public Integer getFleet_power() {
            return fleet_power;
        }

        public Integer getAllynum() {
            return allynum;
        }

        public Integer getStarter() {
            return starter;
        }

        public Integer getStarter2() {
            return starter2;
        }

        public Integer getTitle() {
            return title;
        }

        public Integer getMedal_num() {
            return medal_num;
        }

        public Integer getDark() {
            return dark;
        }

        public Integer getProduce_power() {
            return produce_power;
        }

        public Integer getResearch_power() {
            return research_power;
        }

        public Integer getConquer() {
            return conquer;
        }

        public Integer getCrystal_pack() {
            return crystal_pack;
        }

        public Integer getSponsor() {
            return sponsor;
        }

        public Integer getHyper() {
            return hyper;
        }

        public Integer getC_time() {
            return c_time;
        }

        public Integer getHero_num() {
            return hero_num;
        }

        public Integer getHero_left_time() {
            return hero_left_time;
        }
    }

    public class Level {
        private Integer cur;
        private Integer fame;
        private Integer prev_fame;
        private Integer next_fame;

        public Integer getCur() {
            return cur;
        }

        public Integer getFame() {
            return fame;
        }

        public Integer getPrev_fame() {
            return prev_fame;
        }

        public Integer getNext_fame() {
            return next_fame;
        }
    }
}
