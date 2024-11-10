package com.example.lld.inventoryManagement.payment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PaymentFactory {
    private PaymentStratergy upi = new Upi();
    private PaymentStratergy cash = new Cash();
}
