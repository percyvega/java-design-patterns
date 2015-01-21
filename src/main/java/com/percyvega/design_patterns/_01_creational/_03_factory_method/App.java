package com.percyvega.design_patterns._01_creational._03_factory_method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class App {

    private final static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) throws ClassNotFoundException {
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
