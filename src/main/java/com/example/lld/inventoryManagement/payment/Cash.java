package com.example.lld.inventoryManagement.payment;

public class Cash implements PaymentStratergy{
    @Override
    public boolean pay(int amount) {
        return true;
    }
}
