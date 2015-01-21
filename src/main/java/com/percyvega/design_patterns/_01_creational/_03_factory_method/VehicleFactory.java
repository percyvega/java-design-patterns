package com.percyvega.design_patterns._01_creational._03_factory_method;

/**
 * Created by Percy on 1/21/2015.
 */
public class VehicleFactory {

    private static final double CAR_TRAFFIC_FACTOR = .35;
    private static final double BICYCLE_TRAFFIC_FACTOR = .05;
    private static final double GLIDER_TRAFFIC_FACTOR = .01;

    public static Vehicle fabricate(String vehicleType, double maxSpeed) throws ClassNotFoundException {
        if (vehicleType.equalsIgnoreCase("car"))
            return new Car(maxSpeed * (1 - CAR_TRAFFIC_FACTOR));
        else if (vehicleType.equalsIgnoreCase("bicycle"))
            return new Bicycle(maxSpeed * (1 - BICYCLE_TRAFFIC_FACTOR));
        else if (vehicleType.equalsIgnoreCase("glider"))
            return new Glider(maxSpeed * (1 - GLIDER_TRAFFIC_FACTOR));
        else
            throw new ClassNotFoundException(vehicleType);
    }
}
