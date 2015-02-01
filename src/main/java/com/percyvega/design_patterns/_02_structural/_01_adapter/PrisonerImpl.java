package com.percyvega.design_patterns._02_structural._01_adapter;

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
public class PrisonerImpl implements Prisoner {

    private long prisonerId;
    private String firstName;
    private String lastName;
    private LocalDateTime birthdate;

    @Override
    public long getPrisonerId() {
        return prisonerId;
    }

    @Override
    public void setPrisonerId(long prisonerId) {
        this.prisonerId = prisonerId;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public LocalDateTime getBirthdate() {
        return birthdate;
    }

    @Override
    public void setBirthdate(LocalDateTime birthdate) {
        this.birthdate = birthdate;
    }
}
