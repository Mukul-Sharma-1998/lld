package com.example.lld.parkingLot.parkingSpotSearch;

import com.example.lld.parkingLot.ParkingFloor;
import com.example.lld.parkingLot.ParkingSpot;
import com.example.lld.parkingLot.parkingSpotSearch.ParkingSpotSearchStratergy;

import java.util.List;

public class ParkingSpotSearchDefault implements ParkingSpotSearchStratergy {
    @Override
    public ParkingSpot findParkingSpot(List<ParkingFloor> parkingFloors) {
        return parkingFloors.get(0).getParkingSlots().get(0);
    }
}
