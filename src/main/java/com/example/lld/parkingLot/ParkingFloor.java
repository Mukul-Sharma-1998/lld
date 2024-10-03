package com.example.lld.parkingLot;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ParkingFloor {
    List<ParkingSpot> parkingSlots;

    public void addParkingSlot(ParkingSpot parkingSlot) {
        this.parkingSlots.add(parkingSlot);
    }

    public void removeParkingSlot(int parkingSlotLocation) {
        this.parkingSlots.remove(parkingSlotLocation);
    }


}
