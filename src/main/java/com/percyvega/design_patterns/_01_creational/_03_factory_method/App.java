package com.percyvega.design_patterns._01_creational._03_factory_method;

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
public class App {

    private final static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.debug("Starting main()");

        Vehicle car = VehicleFactory.fabricate("car", 61.4);
        Vehicle bicycle = VehicleFactory.fabricate("bicycle", 9.6);
        Vehicle glider = VehicleFactory.fabricate("glider", 126.2);

        car.calculateTimeToTravel(200.00);
        bicycle.calculateTimeToTravel(200.00);
        glider.calculateTimeToTravel(200.00);

        logger.debug("Finishing main()");
    }

}
