package com.percyvega.design_patterns._01_creational._03_factory_method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by Percy on 1/21/2015.
 */
public abstract class Vehicle {

    private final static Logger logger = LoggerFactory.getLogger(Vehicle.class);

    private double averageSpeed;

    public Vehicle(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    protected abstract String getVehicleAction();

    public void calculateTimeToTravel(double distanceMiles) {
        NumberFormat numberFormat = new DecimalFormat("#.##");

        StringBuilder stringBuilder = new StringBuilder()
                .append("At an average speed of ")
                .append(numberFormat.format(averageSpeed))
                .append(", the ")
                .append(this.getClass().getSimpleName())
                .append(" ")
                .append(getVehicleAction())
                .append(" will take ")
                .append(numberFormat.format(distanceMiles / averageSpeed))
                .append(" hours.");

        logger.debug(stringBuilder.toString());
    }

}
