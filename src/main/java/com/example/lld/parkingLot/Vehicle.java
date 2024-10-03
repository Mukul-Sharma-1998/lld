package com.example.lld.parkingLot;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
    public String vehicleNumber;
    public VehicleType vehicleType;

    public String toString() {
        return " VehicleNumber:"+this.vehicleNumber+" VehicleType:"+this.vehicleType;
    }
}
