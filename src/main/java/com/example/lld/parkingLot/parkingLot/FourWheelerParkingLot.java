package com.example.lld.parkingLot.parkingLot;

import com.example.lld.parkingLot.ParkingFloor;
import com.example.lld.parkingLot.parkingLot.ParkingLot;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;


public class FourWheelerParkingLot extends ParkingLot {
    public <E> FourWheelerParkingLot(ArrayList<ParkingFloor> es) {
        super.parkingFloors = es;
    }
}
