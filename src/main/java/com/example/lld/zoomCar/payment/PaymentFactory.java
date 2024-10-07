package com.example.lld.zoomCar.payment;

import lombok.Getter;

@Getter
public class PaymentFactory {
    PaymentMethod paymentByCard = new PaymentByCard();
    PaymentMethod paymentByCash = new PaymentByCash();

}
