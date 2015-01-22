package com.percyvega.design_patterns._01_creational._03_factory_method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DecimalFormat;
import java.text.NumberFormat;

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
public abstract class Vehicle {

    private final static Logger logger = LoggerFactory.getLogger(Vehicle.class);

    private double averageSpeed;

    public Vehicle(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    protected abstract String getVehicleAction();

    public void calculateTimeToTravel(double distanceMiles) {
        NumberFormat numberFormat = new DecimalFormat("#.##");

        StringBuilder stringBuilder = new StringBuilder()
                .append("At an average speed of ")
                .append(numberFormat.format(averageSpeed))
                .append(", the ")
                .append(this.getClass().getSimpleName())
                .append(" ")
                .append(getVehicleAction())
                .append(" will take ")
                .append(numberFormat.format(distanceMiles / averageSpeed))
                .append(" hours.");

        logger.debug(stringBuilder.toString());
    }

}
