package com.example.lld.stratergyDesignPattern.VehicleExample.entity.userPayment;

import com.example.lld.stratergyDesignPattern.VehicleExample.stratergy.payment.PaymentMethod;

public class SuperUser extends User{

    public SuperUser(PaymentMethod paymentMethod) {
        // we could have added the CardPayment stratergy here itself instead of asking in the argument
        super(paymentMethod);
    }
}
