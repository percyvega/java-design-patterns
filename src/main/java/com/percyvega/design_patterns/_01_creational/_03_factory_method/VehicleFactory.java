package com.percyvega.design_patterns._01_creational._03_factory_method;

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
public class VehicleFactory {

    private static final double CAR_TRAFFIC_FACTOR = .35;
    private static final double BICYCLE_TRAFFIC_FACTOR = .05;
    private static final double GLIDER_TRAFFIC_FACTOR = .01;

    public static Vehicle fabricate(String vehicleType, double maxSpeed) {
        if (vehicleType.equalsIgnoreCase("car"))
            return new Car(maxSpeed * (1 - CAR_TRAFFIC_FACTOR));
        else if (vehicleType.equalsIgnoreCase("bicycle"))
            return new Bicycle(maxSpeed * (1 - BICYCLE_TRAFFIC_FACTOR));
        else if (vehicleType.equalsIgnoreCase("glider"))
            return new Glider(maxSpeed * (1 - GLIDER_TRAFFIC_FACTOR));
        else
            throw new IllegalArgumentException(vehicleType);
    }
}
