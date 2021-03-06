package com.percyvega.design_patterns._01_creational._05_singleton;

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
public enum EarthBestSingleton {
    INSTANCE(9.8, 12742, 40041);

    public double getGravityMs2() {
        return gravityMs2;
    }

    public int getMeanDiameterKm() {
        return meanDiameterKm;
    }

    public int getCircumferenceKm() {
        return circumferenceKm;
    }

    private final double gravityMs2;
    private final int meanDiameterKm;
    private final int circumferenceKm;

    EarthBestSingleton(double gravityMs2, int meanDiameterKm, int circumferenceKm) {
        this.gravityMs2 = gravityMs2;
        this.meanDiameterKm = meanDiameterKm;
        this.circumferenceKm = circumferenceKm;
    }

    // This method is not required.
    // Should be able to access the singleton instance using EarthBestSingleton.INSTANCE
    public static EarthBestSingleton getInstance() {
        return INSTANCE;
    }

    @Override
    public String toString() {
        return "Gravity (m/s^2): " + getGravityMs2() + ". " +
                "Mean Diameter (Km): " + getMeanDiameterKm() + ". " +
                "Circumference (Km): " + getCircumferenceKm() + ".";
    }
}
