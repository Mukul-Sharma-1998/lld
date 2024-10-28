package com.example.lld.bookMyShow;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Seat {
    int id;
    SeatType seatType;

    public String toString() {
        return this.id + this.seatType.toString();
    }
}
