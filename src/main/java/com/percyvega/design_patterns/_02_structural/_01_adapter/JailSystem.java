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
public abstract class JailSystem {

    private final static Logger logger = LoggerFactory.getLogger(JailSystem.class);

    public static void identifyPrisoner(Prisoner prisoner) {
        logger.debug("Identifying prisoner:");
        logger.debug("\tPrisoner Id: " + prisoner.getPrisonerId());
        logger.debug("\tFirst name: " + prisoner.getFirstName());
        logger.debug("\tLast name: " + prisoner.getLastName());
        logger.debug("\tBirth date: " + prisoner.getBirthdate());
    }

    public static void describePrisoner(PrisonerCharacteristics prisonerCharacteristics) {
        logger.debug("\tBlood Type: " + prisonerCharacteristics.getBloodType());
        logger.debug("\tEye Color: " + prisonerCharacteristics.getEyeColor());
        logger.debug("\tHair Color: " + prisonerCharacteristics.getHairColor());
    }
}
