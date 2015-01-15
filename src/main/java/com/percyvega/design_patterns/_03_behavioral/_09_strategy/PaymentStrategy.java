package com.percyvega.design_patterns._03_behavioral._09_strategy;

/**
 * Created by Percy on 1/9/2015.
 */
public interface PaymentStrategy {

    void charge(String email, double amount, boolean audit);

}
