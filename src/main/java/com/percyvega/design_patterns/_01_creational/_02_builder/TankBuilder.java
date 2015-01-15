package com.percyvega.design_patterns._01_creational._02_builder;

/**
 * Created by Percy on 1/5/2015.
 */
public class TankBuilder extends VehicleBuilder {

    @Override
    protected void buildChassis() {
        getVehicle().add(" + hull + turret");
    }

    @Override
    protected void buildWheels() {
        getVehicle().add(" + metallic wheels + tracks");
    }

    @Override
    protected void buildEntrance() {
        getVehicle().add(" + hatch");
    }

    @Override
    protected void buildColor() {
        getVehicle().add(" + green paint");
    }
}
