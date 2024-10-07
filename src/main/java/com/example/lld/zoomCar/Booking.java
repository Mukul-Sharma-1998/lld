package com.example.lld.zoomCar;

import com.example.lld.parkingLot.Vehicle;
import com.example.lld.zoomCar.payment.PaymentStatus;
import com.example.lld.zoomCar.store.Store;

import java.time.LocalDateTime;

public class Booking {
    Vehicle vehicle;
    User user;
    LocalDateTime pickupDate;
    LocalDateTime dropoffDate;
    Store store;
    PaymentStatus paymentStatus;
}
