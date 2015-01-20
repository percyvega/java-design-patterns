package com.percyvega.design_patterns._03_behavioral._02_command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Percy on 1/19/2015.
 */
public class LockEmergencyBrakeCommand implements Command {

    private final static Logger logger = LoggerFactory.getLogger(LockEmergencyBrakeCommand.class);

    private CarReceiver carReceiver;

    public LockEmergencyBrakeCommand(CarReceiver carReceiver) {
        this.carReceiver = carReceiver;
    }

    @Override
    public void execute() {
        logger.debug("Attempting to lock the emergency brake.");

        if(!carReceiver.isEmergencyBrakeLocked()) {
            carReceiver.setEmergencyBrakeLocked(true);
            logger.debug("Emergency brake locked successfully.");
        } else {
            logger.debug("Emergency brake was already locked.");
        }
    }

    @Override
    public void undo() {
        logger.debug("Attempting to undo locking the emergency brake.");

        if(carReceiver.isEmergencyBrakeLocked()) {
            carReceiver.setEmergencyBrakeLocked(false);
            logger.debug("Undo was successful.");
        } else {
            logger.debug("Emergency brake was already unlocked.");
        }
    }
}
