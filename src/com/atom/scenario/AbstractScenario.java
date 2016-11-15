package com.atom.scenario;

import com.atom.interfaces.Configuration;

public abstract class AbstractScenario {

    protected final Configuration configuration;

    public AbstractScenario(Configuration configuration) {
        this.configuration = configuration;
    }

    public abstract void doScenario();

    public void doLogin() {

    }
}
