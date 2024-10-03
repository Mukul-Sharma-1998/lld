package com.example.lld.parkingLot;

import com.example.lld.parkingLot.parkingLot.ParkingLotFactory;
import com.example.lld.parkingLot.parkingSpotSearch.ParkingSpotSearchFactory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EntryGate {
    ParkingLotFactory parkingLotFactory;
    ParkingSpotSearchFactory parkingSpotSearchFactory;

    public ParkingSpot findSparingSpot(VehicleType vehicleType) {
        if(vehicleType.equals(VehicleType.BIKE)) {
            return parkingLotFactory.getTwoWheelerParkingLot().findParkingSlot(parkingSpotSearchFactory.getParkingSpotSearchDefault());
        }
        else {
            return parkingLotFactory.getFourWheelerParkingLot().findParkingSlot(parkingSpotSearchFactory.getParkingSpotSearchOptimised());
        }
    }

    public Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        this.occupyParkingSlot(parkingSpot, vehicle);
        return new Ticket(vehicle, parkingSpot, LocalTime.now(), false);
    }

    public void occupyParkingSlot(ParkingSpot parkingSpot, Vehicle vehicle) {
        parkingSpot.occupyParkingSlot(vehicle);
    }
}
