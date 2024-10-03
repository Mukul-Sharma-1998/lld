package com.example.lld.parkingLot.parkingLot;

import com.example.lld.parkingLot.parkingLot.FourWheelerParkingLot;
import com.example.lld.parkingLot.parkingLot.TwoWheelerParkingLot;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ParkingLotFactory {
    ParkingLot fourWheelerParkingLot;
    ParkingLot twoWheelerParkingLot;

}
