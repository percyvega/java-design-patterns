package com.percyvega.design_patterns._01_creational._02_builder;

/**
 * Created by Percy on 1/5/2015.
 */
public class Vehicle {

    private StringBuilder description = new StringBuilder();

    public void add(String component) {
        description.append(component);
    }

    @Override
    public String toString() {
        return description.toString();
    }

}
