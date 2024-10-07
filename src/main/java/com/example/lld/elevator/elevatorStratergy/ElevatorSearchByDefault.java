package com.example.lld.elevator.elevatorStratergy;

import com.example.lld.elevator.Elevator;
import com.example.lld.elevator.Status;

import java.util.List;

public class ElevatorSearchByDefault implements ElevatorSearchStratergy{
    @Override
    public Elevator searchElevator(int currentFloor, List<Elevator> elevators, Status direction) {
        elevators.get(3).getInterButton().moveElevator(currentFloor);
        return elevators.get(3);
    }
}
