package com.example.lld.stratergyDesignPattern.VehicleExample.entity.vehicles;

import com.example.lld.stratergyDesignPattern.VehicleExample.stratergy.drive.DriveStratergy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle(DriveStratergy driveStratergy) {
        // we could have added the sprotsDrive stratergy here itself instead of asking in the argument
        super(driveStratergy);
    }
}
