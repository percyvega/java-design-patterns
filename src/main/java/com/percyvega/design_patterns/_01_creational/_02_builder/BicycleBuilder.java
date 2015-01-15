package com.percyvega.design_patterns._01_creational._02_builder;

/**
 * Created by Percy on 1/5/2015.
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
