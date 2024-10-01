package com.example.lld.stratergyDesignPattern.VehicleExample.stratergy.payment;

public class BtcPayment implements PaymentMethod{
    @Override
    public void payment() {
        System.out.println("Payment via bitcoin");
    }
}
