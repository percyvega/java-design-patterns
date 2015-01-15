package com.percyvega.design_patterns._03_behavioral._09_strategy;

/**
 * Created by Percy on 1/9/2015.
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
