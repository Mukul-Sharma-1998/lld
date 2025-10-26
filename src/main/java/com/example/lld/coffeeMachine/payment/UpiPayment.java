package com.example.lld.coffeeMachine.payment;

public class UpiPayment implements PaymentMethod{
    @Override
    public boolean pay() {
        return true;
    }
}
