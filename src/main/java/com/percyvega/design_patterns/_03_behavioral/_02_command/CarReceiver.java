package com.percyvega.design_patterns._03_behavioral._02_command;

/**
 * Created by Percy on 1/19/2015.
 */
public class CarReceiver {

    private boolean isEngineStarted = false;
    private boolean isEmergencyBrakeLocked = true;

    public boolean isEngineStarted() {
        return isEngineStarted;
    }

    public void setEngineStarted(boolean isEngineStarted) {
        this.isEngineStarted = isEngineStarted;
    }

    public boolean isEmergencyBrakeLocked() {
        return isEmergencyBrakeLocked;
    }

    public void setEmergencyBrakeLocked(boolean isEmergencyBrakeLocked) {
        this.isEmergencyBrakeLocked = isEmergencyBrakeLocked;
    }

}
