package com.example.lld.stratergyDesignPattern.VehicleExample.stratergy.drive;

public class OffRoadDrive implements DriveStratergy {
    @Override
    public void drive() {
        System.out.println("Off-road drive stratergy");
    }
}
