package com.example.lld.stratergyDesignPattern.VehicleExample.entity.vehicles;

import com.example.lld.stratergyDesignPattern.VehicleExample.stratergy.drive.DriveStratergy;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle(DriveStratergy driveStratergy) {
        // we could have added the OffRoadDrive stratergy here itself instead of asking in the argument
        super(driveStratergy);
    }
}
