package com.example.lld.coffeeMachine.payment;

public class CashPayment implements PaymentMethod{
    @Override
    public boolean pay() {
        return true;
    }
}
