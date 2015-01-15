package com.percyvega.design_patterns._01_creational._02_builder;

/**
 * Created by Percy on 1/6/2015.
 */
public class VehicleDirector {

    private VehicleBuilder vehicleBuilder;

    public VehicleBuilder getVehicleBuilder() {
        return vehicleBuilder;
    }

    public void setVehicleBuilder(VehicleBuilder vehicleBuilder) {
        this.vehicleBuilder = vehicleBuilder;
    }

    public void buildFullVehicle() {
        vehicleBuilder.buildChassis();
        vehicleBuilder.buildWheels();
        vehicleBuilder.buildEntrance();
        vehicleBuilder.buildColor();
    }

    public void buildCoreVehicle() {
        vehicleBuilder.buildChassis();
//        vehicleBuilder.buildEntrance();
        vehicleBuilder.buildWheels();
//        vehicleBuilder.buildColor();
    }
}
