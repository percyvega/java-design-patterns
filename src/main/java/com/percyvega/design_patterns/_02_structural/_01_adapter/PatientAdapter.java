package com.percyvega.design_patterns._02_structural._01_adapter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

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
public class PatientAdapter implements Patient {

    private final PrisonerCharacteristics prisonerCharacteristics;
    private final Prisoner prisoner;

    public PatientAdapter(Prisoner prisoner, PrisonerCharacteristics prisonerCharacteristics) {
        this.prisoner = prisoner;
        this.prisonerCharacteristics = prisonerCharacteristics;
    }

    @Override
    public long getPatientId() {
        return prisoner.getPrisonerId();
    }

    @Override
    public void setPatientId(long patientId) {
        prisoner.setPrisonerId(patientId);
    }

    @Override
    public String getFullName() {
        return prisoner.getFirstName() + " " + prisoner.getLastName();
    }

    @Override
    public void setFullName(String fullName) {
        String[] strings = fullName.split(" ");
        prisoner.setFirstName(strings[0]);
        prisoner.setLastName(strings[1]);
    }

    @Override
    public int getAge() {
        return (int) ChronoUnit.YEARS.between(prisoner.getBirthdate(), LocalDateTime.now());
    }

    @Override
    public void setAge(int age) {
        LocalDate today = LocalDate.now();
        prisoner.setBirthdate(LocalDateTime.of(
                today.getYear() - age,
                today.getMonth(),
                today.getDayOfMonth(), 0, 0));
    }

    @Override
    public String getBloodType() {
        return prisonerCharacteristics.getBloodType();
    }

    @Override
    public void setBloodType(String bloodType) {
        prisonerCharacteristics.setBloodType(bloodType);
    }
}
