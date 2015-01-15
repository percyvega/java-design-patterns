package com.percyvega.design_patterns._03_behavioral._09_strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private final static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.debug("Starting main()");

        CustomerContext customerCheckingOut1 = new CustomerContext("paypal.user@gmail.com", 25615.96);
        CustomerContext customerCheckingOut2 = new CustomerContext("citi.user@gmail.com", 50000.37);

        customerCheckingOut1.setPreferredPaymentMethod(new PayPalStrategy());
        customerCheckingOut2.setPreferredPaymentMethod(new CreditCardStrategy());

        customerCheckingOut1.submitPurchase();
        System.out.println();
        customerCheckingOut2.submitPurchase();

        logger.debug("Finishing main()");

    }

}
