package com.percyvega.design_patterns._02_structural._01_adapter;

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
public abstract class HospitalSystem {

    private final static Logger logger = LoggerFactory.getLogger(HospitalSystem.class);

    public static void logPatient(Patient patient) {
        logger.debug("Logging patient:");
        logger.debug("\tPatient Id: " + patient.getPatientId());
        logger.debug("\tFull name: " + patient.getFullName());
        logger.debug("\tAge: " + patient.getAge());
        logger.debug("\tBlood Type: " + patient.getBloodType());
    }

}
