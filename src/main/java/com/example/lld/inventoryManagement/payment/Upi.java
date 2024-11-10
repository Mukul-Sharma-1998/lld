package com.example.lld.inventoryManagement.payment;

public class Upi implements PaymentStratergy{
    @Override
    public boolean pay(int amount) {
        return true;
    }
}
