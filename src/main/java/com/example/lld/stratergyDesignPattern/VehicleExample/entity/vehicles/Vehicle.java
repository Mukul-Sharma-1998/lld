package com.example.lld.stratergyDesignPattern.VehicleExample.entity.vehicles;

import com.example.lld.stratergyDesignPattern.VehicleExample.stratergy.drive.DriveStratergy;

public class Vehicle {
    public DriveStratergy driveStratergy;

    public Vehicle(DriveStratergy driveStratergy) {
        this.driveStratergy = driveStratergy;
    }
}
