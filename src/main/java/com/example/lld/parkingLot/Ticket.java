package com.example.lld.parkingLot;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Ticket {
    public Vehicle vehicle;
    public ParkingSpot parkingSpot;
    public LocalTime entryTime;
    public boolean paymentStatus;

    public String toString() {
        return this.vehicle.toString() + this.parkingSpot.toString() + ", Entry time: " + this.entryTime + ", Payment Status:" + this.paymentStatus;
    }
}
