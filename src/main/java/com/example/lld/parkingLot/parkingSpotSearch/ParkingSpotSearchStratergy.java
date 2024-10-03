package com.example.lld.parkingLot.parkingSpotSearch;

import com.example.lld.parkingLot.ParkingFloor;
import com.example.lld.parkingLot.ParkingSpot;

import java.util.List;

public interface ParkingSpotSearchStratergy {
    public ParkingSpot findParkingSpot(List<ParkingFloor> parkingFloors);
}
