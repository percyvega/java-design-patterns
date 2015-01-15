package com.percyvega.design_patterns._03_behavioral._09_strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Percy on 1/9/2015.
 */
public class CreditCardStrategy implements PaymentStrategy {

    private final static Logger logger = LoggerFactory.getLogger(CreditCardStrategy.class);

    @Override
    public void charge(String email, double amount, boolean audit) {
        logger.debug("Connecting to Credit Card network.");
        logger.debug("Authenticating " + email + ".");
        if (audit)
            logger.debug("Requesting Credit Card network to audit transaction.");
        logger.debug("Debiting $" + amount + " from account.");
        logger.debug("Disconnecting from Credit Card network.");
    }

}
