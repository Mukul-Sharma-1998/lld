package com.example.lld.zoomCar.payment;

import com.example.lld.zoomCar.Booking;

public interface PaymentMethod {
    public void makePayment(Booking booking);
}
