package com.percyvega.design_patterns._03_behavioral._02_command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright 2015 Percy Vega
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
