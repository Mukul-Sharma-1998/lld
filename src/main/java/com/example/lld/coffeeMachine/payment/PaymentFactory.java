package com.example.lld.coffeeMachine.payment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PaymentFactory {
    PaymentMethod cashPayment;
    PaymentMethod upiPayment;

    public PaymentMethod getPayment(String paymentMethod) {
        if(paymentMethod.equalsIgnoreCase("UPI")) return this.upiPayment;
        else return cashPayment;
    }

}
