package com.example.lld.parkingLot.payment;

public class PayWithCash implements PaymentStratergy{
    @Override
    public boolean pay(int cost) {
        return true;
    }
}
