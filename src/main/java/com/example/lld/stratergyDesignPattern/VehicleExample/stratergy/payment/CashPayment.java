package com.example.lld.stratergyDesignPattern.VehicleExample.stratergy.payment;

import com.example.lld.stratergyDesignPattern.VehicleExample.stratergy.payment.PaymentMethod;

public class CashPayment implements PaymentMethod {
    @Override
    public void payment() {
        System.out.println("Payment via cash");
    }
}
