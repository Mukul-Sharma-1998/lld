package com.example.lld.parkingLot.parkingLot;

import com.example.lld.parkingLot.ParkingFloor;
import com.example.lld.parkingLot.ParkingSpot;
import com.example.lld.parkingLot.parkingSpotSearch.ParkingSpotSearchFactory;
import com.example.lld.parkingLot.parkingSpotSearch.ParkingSpotSearchStratergy;

import java.util.List;

public class ParkingLot {
    List<ParkingFloor> parkingFloors;

    public void addParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloors.add(parkingFloor);
    }

    public void removeParkingFloor(int parkingFloorlocation) {
        this.parkingFloors.remove(parkingFloorlocation);
    }

    public ParkingSpot findParkingSlot(ParkingSpotSearchStratergy parkingSpotSearchStratergy) {
        return parkingSpotSearchStratergy.findParkingSpot(parkingFloors);
    }
}
