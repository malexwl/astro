package com.atom.scenario;

public class ScenarioLogin extends AbstractScenario{

    public void doScenario() {
        doLoginRequest();
        doStatusRequest();
        doStartRequest();
        doReadRequest();
    }
}
