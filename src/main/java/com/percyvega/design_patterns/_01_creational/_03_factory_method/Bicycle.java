package com.percyvega.design_patterns._01_creational._03_factory_method;

/**
 * Created by Percy on 1/21/2015.
 */
public class Bicycle extends Vehicle {

        public Bicycle(double averageSpeed) {
            super(averageSpeed);
        }

        @Override
        protected String getVehicleAction() {
            return "ride";
        }

    }
