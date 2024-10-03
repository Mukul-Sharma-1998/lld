package com.example.lld.parkingLot.payment;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PaymentFactory {
    public PayWithCash payWithCash;
    public PayWithCard payWithCard;
}
