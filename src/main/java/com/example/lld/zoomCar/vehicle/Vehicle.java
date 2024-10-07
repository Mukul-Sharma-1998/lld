package com.example.lld.zoomCar.vehicle;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehicle {
    int vehicleId;
    String vehicleNumver;
    VehicleType vehicleType;
    VehicleStatus vehicleStatus;
    int kmDriven;
    String rc;
}
