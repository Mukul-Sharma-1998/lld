package com.example.lld.parkingLot.payment;

public class PayWithCard implements PaymentStratergy{
    @Override
    public boolean pay(int cost) {
        return true;
    }
}
