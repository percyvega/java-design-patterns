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
public class LockEmergencyBrakeCommand implements Command {

    private final static Logger logger = LoggerFactory.getLogger(LockEmergencyBrakeCommand.class);

    private CarReceiver carReceiver;

    public LockEmergencyBrakeCommand(CarReceiver carReceiver) {
        this.carReceiver = carReceiver;
    }

    @Override
    public void execute() {
        logger.debug("Attempting to lock the emergency brake.");

        if (!carReceiver.isEmergencyBrakeLocked()) {
            carReceiver.setEmergencyBrakeLocked(true);
            logger.debug("Emergency brake locked successfully.");
        } else {
            logger.debug("Emergency brake was already locked.");
        }
    }

    @Override
    public void undo() {
        logger.debug("Attempting to undo locking the emergency brake.");

        if (carReceiver.isEmergencyBrakeLocked()) {
            carReceiver.setEmergencyBrakeLocked(false);
            logger.debug("Undo was successful.");
        } else {
            logger.debug("Emergency brake was already unlocked.");
        }
    }
}
