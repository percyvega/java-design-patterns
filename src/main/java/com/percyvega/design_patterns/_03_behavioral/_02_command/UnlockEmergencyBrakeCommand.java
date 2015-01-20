package com.percyvega.design_patterns._03_behavioral._02_command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Percy on 1/19/2015.
 */
public class UnlockEmergencyBrakeCommand implements Command {

    private final static Logger logger = LoggerFactory.getLogger(UnlockEmergencyBrakeCommand.class);

    private CarReceiver carReceiver;

    public UnlockEmergencyBrakeCommand(CarReceiver carReceiver) {
        this.carReceiver = carReceiver;
    }

    @Override
    public void execute() {
        logger.debug("Attempting to unlock the emergency brake.");

        if(carReceiver.isEmergencyBrakeLocked()) {
            carReceiver.setEmergencyBrakeLocked(false);
            logger.debug("Emergency brake unlocked successfully.");
        } else {
            logger.debug("Emergency brake was already unlocked.");
        }
    }

    @Override
    public void undo() {
        logger.debug("Attempting to undo unlocking the emergency brake.");

        if(!carReceiver.isEmergencyBrakeLocked()) {
            carReceiver.setEmergencyBrakeLocked(true);
            logger.debug("Undo was successful.");
        } else {
            logger.debug("Emergency brake was already locked.");
        }
    }
}
