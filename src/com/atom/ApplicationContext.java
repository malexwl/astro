package com.atom;

public class ApplicationContext {

    private static volatile ApplicationContext instance;

    private ApplicationContext() {
    }

    public static ApplicationContext getInstance() {
        if (instance == null)
    }
}
