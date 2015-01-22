package com.percyvega.design_patterns._03_behavioral._09_strategy;

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
public class CustomerContext {

    private String email;
    private double total;
    private PaymentStrategy preferredPaymentMethod;

    public CustomerContext(String email, double total) {
        this.email = email;
        this.total = total;
    }

    public void setPreferredPaymentMethod(PaymentStrategy preferredPaymentMethod) {
        this.preferredPaymentMethod = preferredPaymentMethod;
    }

    public void submitPurchase() {
        boolean audit = false;
        if (total > 50000)
            audit = true;
        preferredPaymentMethod.charge(email, total, audit);
    }
}
