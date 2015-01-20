package com.percyvega.design_patterns._03_behavioral._02_command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Percy on 1/19/2015.
 */
public class StopEngineCommand implements Command {

    private final static Logger logger = LoggerFactory.getLogger(StopEngineCommand.class);

    private CarReceiver carReceiver;

    public StopEngineCommand(CarReceiver carReceiver) {
        this.carReceiver = carReceiver;
    }

    @Override
    public void execute() {
        logger.debug("Attempting to stop the engine.");

        if(carReceiver.isEngineStarted()) {
            carReceiver.setEngineStarted(false);
            logger.debug("Engine stopped successfully.");
        } else {
            logger.debug("Engine was already stopped.");
        }
    }

    @Override
    public void undo() {
        logger.debug("Attempting to undo stopping the engine.");

        if(!carReceiver.isEngineStarted()) {
            carReceiver.setEngineStarted(true);
            logger.debug("Undo was successful.");
        } else {
            logger.debug("Engine was already started.");
        }
    }
}
