package com.percyvega.design_patterns._02_structural._01_adapter;

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
public class PrisonerCharacteristicsImpl implements PrisonerCharacteristics {
    private String bloodType;
    private String eyeColor;
    private String hairColor;

    @Override
    public String getBloodType() {
        return bloodType;
    }

    @Override
    public String getEyeColor() {
        return eyeColor;
    }

    @Override
    public String getHairColor() {
        return hairColor;
    }

    @Override
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    @Override
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    @Override
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
}
