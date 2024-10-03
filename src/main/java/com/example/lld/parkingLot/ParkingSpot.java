package com.example.lld.parkingLot;

import lombok.*;

@Getter
@Setter
public class ParkingSpot {
    public ParkingSpotType parkingSpotType;
    public boolean free;
    public Vehicle vehicle;

    public ParkingSpot(ParkingSpotType fourwheeler, boolean b) {
        this.parkingSpotType = fourwheeler;
        this.free = b;
    }


    public void occupyParkingSlot(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.free = false;
    }

    public void vacateParkingSlot() {
        this.vehicle = null;
        this.free = true;
    }

    public String toString() {
        return "ParkingSpotType:"+this.parkingSpotType+", Is free:"+this.free;
    }
}
