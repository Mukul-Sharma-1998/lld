package com.example.lld.bookMyShow;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    List<Seat> bookedSeats;
    Show show;
    int price;
    PaymentStatus paymentStatus;
}
