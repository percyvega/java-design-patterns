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
