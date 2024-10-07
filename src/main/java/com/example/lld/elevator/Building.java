package com.example.lld.elevator;

import java.util.List;

public class Building {
    List<Floor> floors;

    public Floor getFloor(int floorNumber, Status direction) {
        for(Floor floor: floors) {
            if(floor.getFloorNumber() == floorNumber) {
                return floor;
            }
        }
        return null;
    }
}
