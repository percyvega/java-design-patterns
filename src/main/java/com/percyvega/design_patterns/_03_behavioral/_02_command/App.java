package com.percyvega.design_patterns._03_behavioral._02_command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private final static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.debug("Starting main()");

        CarReceiver carReceiver = new CarReceiver();

        Command startEngineCommand = new StartEngineCommand(carReceiver);
        Command unlockEmergencyBrakeCommand = new UnlockEmergencyBrakeCommand(carReceiver);
        Command lockEmergencyBrakeCommand = new LockEmergencyBrakeCommand(carReceiver);
        Command stopEngineCommand = new StopEngineCommand(carReceiver);

        DriverInvoker driverInvoker = new DriverInvoker();
        driverInvoker.executeCommand(startEngineCommand);
        driverInvoker.executeCommand(unlockEmergencyBrakeCommand);
        logger.debug("...driving...");
        driverInvoker.executeCommand(lockEmergencyBrakeCommand);
        driverInvoker.undoCommand(lockEmergencyBrakeCommand);
        driverInvoker.executeCommand(stopEngineCommand);
        driverInvoker.executeCommand(stopEngineCommand);

        logger.debug("Finishing main()");
    }

}
