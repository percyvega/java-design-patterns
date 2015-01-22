package com.percyvega.design_patterns._01_creational._02_builder;

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
public class BicycleBuilder extends VehicleBuilder {

    @Override
    protected void buildChassis() {
        getVehicle().add(" + titanium frame");
    }

    @Override
    protected void buildWheels() {
        getVehicle().add(" + mountain rims + tires");
    }

    @Override
    protected void buildEntrance() {
        //a bicycle has neither doors (cars) nor a hatch (tanks)
    }

    @Override
    protected void buildColor() {
        getVehicle().add(" + red paint");
    }
}
