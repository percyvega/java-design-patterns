package com.percyvega.design_patterns._01_creational._02_builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private final static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.debug("Starting main()");

        VehicleDirector vehicleDirector = new VehicleDirector();

        vehicleDirector.setVehicleBuilder(new BicycleBuilder());
        vehicleDirector.buildFullVehicle();
        logger.debug(vehicleDirector.getVehicleBuilder().getVehicle().toString());

        vehicleDirector.setVehicleBuilder(new TankBuilder());
        vehicleDirector.buildFullVehicle();
        logger.debug(vehicleDirector.getVehicleBuilder().getVehicle().toString());

        vehicleDirector.setVehicleBuilder(new TankBuilder());
        vehicleDirector.buildCoreVehicle();
        logger.debug(vehicleDirector.getVehicleBuilder().getVehicle().toString());

        logger.debug("Finishing main()");
    }

}
