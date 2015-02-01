package com.percyvega.design_patterns._02_structural._01_adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.time.LocalDateTime;

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

    public static void main(String[] args) throws ParseException {
        logger.debug("Starting main()");

        Prisoner prisoner = new PrisonerImpl();
        prisoner.setPrisonerId(954);
        prisoner.setFirstName("Percy");
        prisoner.setLastName("Vega");
        prisoner.setBirthdate(LocalDateTime.of(1979, 8, 23, 7, 34, 12));

        PrisonerCharacteristics prisonerCharacteristics = new PrisonerCharacteristicsImpl();
        prisonerCharacteristics.setBloodType("AB-negative");
        prisonerCharacteristics.setEyeColor("Green");
        prisonerCharacteristics.setHairColor("Blonde");

        JailSystem.identifyPrisoner(prisoner);
        JailSystem.describePrisoner(prisonerCharacteristics);

        Patient patient = new PatientAdapter(prisoner, prisonerCharacteristics);

        System.out.println();

        HospitalSystem.logPatient(patient);

        logger.debug("Finishing main()");
    }

}
