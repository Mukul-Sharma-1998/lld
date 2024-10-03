package com.example.lld.parkingLot;

import com.example.lld.parkingLot.costCalculation.CostCalculationFactory;
import com.example.lld.parkingLot.costCalculation.FourWheelerCostCalculation;
import com.example.lld.parkingLot.costCalculation.TwoWheelerCostCalculation;
import com.example.lld.parkingLot.parkingLot.FourWheelerParkingLot;
import com.example.lld.parkingLot.parkingLot.ParkingLot;
import com.example.lld.parkingLot.parkingLot.ParkingLotFactory;
import com.example.lld.parkingLot.parkingSpotSearch.ParkingSpotSearchDefault;
import com.example.lld.parkingLot.parkingSpotSearch.ParkingSpotSearchFactory;
import com.example.lld.parkingLot.parkingSpotSearch.ParkingSpotSearchOptimised;
import com.example.lld.parkingLot.payment.PayWithCard;
import com.example.lld.parkingLot.payment.PayWithCash;
import com.example.lld.parkingLot.payment.PaymentFactory;
import com.example.lld.parkingLot.payment.PaymentType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        ParkingFloor parkingFloorFourWheeler = new ParkingFloor(new ArrayList<>(Arrays
                .asList(
                        new ParkingSpot(ParkingSpotType.FOURWHEELER, true),
                        new ParkingSpot(ParkingSpotType.FOURWHEELER, true))));

        ParkingLot fourWheelerParkingLot = new FourWheelerParkingLot(new ArrayList<>(Arrays.asList(parkingFloorFourWheeler)));

        ParkingFloor parkingFloorTwoWheeler = new ParkingFloor(new ArrayList<>(Arrays
                .asList(
                        new ParkingSpot(ParkingSpotType.TWOWHEELER, true),
                        new ParkingSpot(ParkingSpotType.TWOWHEELER, true))));

        ParkingLot twoWheelerParkingLot = new FourWheelerParkingLot(new ArrayList<>(Arrays.asList(parkingFloorTwoWheeler)));

        ParkingLotFactory parkingLotFactory = new ParkingLotFactory(fourWheelerParkingLot, twoWheelerParkingLot);

        ParkingSpotSearchFactory parkingSpotSearchFactory = new ParkingSpotSearchFactory(new ParkingSpotSearchDefault(), new ParkingSpotSearchOptimised());

        EntryGate entryGate = new EntryGate(parkingLotFactory, parkingSpotSearchFactory);


        // created a vehicle
        Vehicle vehicle = new Vehicle("DL3CT5084", VehicleType.CAR);


        // get free parking spot
        ParkingSpot freeParkingSpot = entryGate.findSparingSpot(vehicle.getVehicleType());
        System.out.println("Vacant parking spot is: " + freeParkingSpot.toString());
        // generated ticket and occupied the parking spot
        Ticket ticket = entryGate.generateTicket(vehicle, freeParkingSpot);
        System.out.println("Ticket generated: " + ticket.toString());

        // Exit gate is created
        CostCalculationFactory costCalculationFactory = new CostCalculationFactory(new FourWheelerCostCalculation(), new TwoWheelerCostCalculation());
        PaymentFactory paymentFactory = new PaymentFactory(new PayWithCash(), new PayWithCard());
        ExitGate exitGate = new ExitGate(costCalculationFactory, paymentFactory);

        int cost = exitGate.calculateCost(ticket);
        System.out.println("final calculated cost: " + cost );

        System.out.println("Before Payment: " + ticket.toString());

        exitGate.makePayment(ticket, PaymentType.CARD);
        System.out.println("After payment: " + ticket.toString());
    }
}
