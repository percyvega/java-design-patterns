package com.percyvega.design_patterns._03_behavioral._09_strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Percy on 1/9/2015.
 */
public class PayPalStrategy implements PaymentStrategy {

    private final static Logger logger = LoggerFactory.getLogger(PayPalStrategy.class);

    @Override
    public void charge(String email, double amount, boolean audit) {
        logger.debug("Forwarding user to Paypal page.");
        logger.debug("Requesting Paypal to authenticate " + email + ".");
        if (audit)
            logger.debug("Requesting Paypal to audit transaction.");
        logger.debug("Requesting PayPal to debit $" + amount + " from account.");
        logger.debug("Closing PayPal page.");
    }

}
