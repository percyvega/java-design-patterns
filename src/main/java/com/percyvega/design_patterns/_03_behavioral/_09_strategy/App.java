package com.percyvega.design_patterns._03_behavioral._09_strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright 2015 Percy Vega
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class App {

    private final static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.debug("Starting main()");

        CustomerContext customerCheckingOut1 = new CustomerContext("paypaluser@gmail.com", 25615.96);
        CustomerContext customerCheckingOut2 = new CustomerContext("citiuser@gmail.com", 50000.37);

        customerCheckingOut1.setPreferredPaymentMethod(new PayPalStrategy());
        customerCheckingOut2.setPreferredPaymentMethod(new CreditCardStrategy());

        customerCheckingOut1.submitPurchase();
        System.out.println();
        customerCheckingOut2.submitPurchase();

        logger.debug("Finishing main()");

    }

}
