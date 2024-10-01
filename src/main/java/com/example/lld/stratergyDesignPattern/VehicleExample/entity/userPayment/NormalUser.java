package com.example.lld.stratergyDesignPattern.VehicleExample.entity.userPayment;

import com.example.lld.stratergyDesignPattern.VehicleExample.stratergy.payment.PaymentMethod;

public class NormalUser extends User{

    public NormalUser(PaymentMethod paymentMethod) {
        // we could have added the CashPayment stratergy here itself instead of asking in the argument
        super(paymentMethod);
    }
}
