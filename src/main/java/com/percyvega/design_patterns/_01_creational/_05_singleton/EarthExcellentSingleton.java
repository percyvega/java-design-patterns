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
public class EarthExcellentSingleton {

    private static final EarthExcellentSingleton INSTANCE = new EarthExcellentSingleton();

    private final double gravityMs2;
    private final int meanDiameterKm;
    private final int circumferenceKm;

    public double getGravityMs2() {
        return gravityMs2;
    }

    public int getMeanDiameterKm() {
        return meanDiameterKm;
    }

    public int getCircumferenceKm() {
        return circumferenceKm;
    }

    private EarthExcellentSingleton() {
        this.gravityMs2 = 9.8;
        this.meanDiameterKm = 12742;
        this.circumferenceKm = 40041;
    }

    public static EarthExcellentSingleton getInstance() {
        return INSTANCE;
    }

    @Override
    public String toString() {
        return "Gravity (m/s^2): " + getGravityMs2() + ". " +
                "Mean Diameter (Km): " + getMeanDiameterKm() + ". " +
                "Circumference (Km): " + getCircumferenceKm() + ".";
    }
}
