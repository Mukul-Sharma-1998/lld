package com.example.lld.stratergyDesignPattern.VehicleExample;

import com.example.lld.stratergyDesignPattern.VehicleExample.entity.vehicles.OffRoadVehicle;
import com.example.lld.stratergyDesignPattern.VehicleExample.entity.vehicles.SportsVehicle;
import com.example.lld.stratergyDesignPattern.VehicleExample.entity.vehicles.Vehicle;
import com.example.lld.stratergyDesignPattern.VehicleExample.stratergy.drive.OffRoadDrive;
import com.example.lld.stratergyDesignPattern.VehicleExample.stratergy.drive.SportsDrive;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class vehicleMain {
    public static void main(String[] args) {
        Vehicle sportsVehicle = new SportsVehicle(new SportsDrive());
        sportsVehicle.driveStratergy.drive();

        Vehicle offRoadVehicle = new OffRoadVehicle(new OffRoadDrive());
        offRoadVehicle.driveStratergy.drive();

        Vehicle offRoadSportsVehicle = new SportsVehicle(new OffRoadDrive());
        offRoadSportsVehicle.driveStratergy.drive();
    }
}
