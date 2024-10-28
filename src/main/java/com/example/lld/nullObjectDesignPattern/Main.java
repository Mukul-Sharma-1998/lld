package com.example.lld.nullObjectDesignPattern;

public class Main {
    public static void main(String[] args) {


        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle car = vehicleFactory.getVehicle("CAR");
        Vehicle nullVehicle = vehicleFactory.getVehicle("BIKE");
        printDataOfVehicle(car);
        printDataOfVehicle(nullVehicle);


    }

    public static void printDataOfVehicle(Vehicle vehicle) {

        System.out.println(vehicle.getPeopleCapacity());
        System.out.println(vehicle.getTankCapaticy());
    }
}
