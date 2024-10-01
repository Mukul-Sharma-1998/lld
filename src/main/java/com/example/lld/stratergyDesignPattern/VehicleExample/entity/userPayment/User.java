package com.example.lld.stratergyDesignPattern.VehicleExample.entity.userPayment;

import com.example.lld.stratergyDesignPattern.VehicleExample.stratergy.payment.PaymentMethod;

public class User {
    public PaymentMethod paymentMethod;

    public User(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
