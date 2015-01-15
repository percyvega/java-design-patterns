package com.percyvega.design_patterns._01_creational._02_builder;

/**
 * Created by Percy on 1/5/2015.
 */
public abstract class VehicleBuilder {

    private Vehicle vehicle;

    public VehicleBuilder() {
        vehicle = new Vehicle();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    protected abstract void buildChassis();

    protected abstract void buildWheels();

    protected abstract void buildEntrance();

    protected abstract void buildColor();

}
