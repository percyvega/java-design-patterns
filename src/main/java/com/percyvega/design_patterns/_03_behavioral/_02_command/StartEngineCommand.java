package com.percyvega.design_patterns._03_behavioral._02_command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Percy on 1/19/2015.
 */
public class StartEngineCommand implements Command {

    private final static Logger logger = LoggerFactory.getLogger(StartEngineCommand.class);

    private CarReceiver carReceiver;

    public StartEngineCommand(CarReceiver carReceiver) {
        this.carReceiver = carReceiver;
    }

    @Override
    public void execute() {
        logger.debug("Attempting to start the engine.");

        if(!carReceiver.isEngineStarted()) {
            carReceiver.setEngineStarted(true);
            logger.debug("Engine started successfully.");
        } else {
            logger.debug("Engine was already started.");
        }
    }

    @Override
    public void undo() {
        logger.debug("Attempting to undo starting the engine.");

        if(carReceiver.isEngineStarted()) {
            carReceiver.setEngineStarted(false);
            logger.debug("Undo was successful.");
        } else {
            logger.debug("Engine was already stopped.");
        }
    }
}
