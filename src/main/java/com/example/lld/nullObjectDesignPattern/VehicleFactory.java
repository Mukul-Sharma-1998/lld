package com.example.lld.nullObjectDesignPattern;

public class VehicleFactory {
    public Vehicle getVehicle(String vehicle) {
        if(vehicle.equals("CAR")) {
            return  new Car();
        } else {
            return new NullVehicle();
        }
    }
}
