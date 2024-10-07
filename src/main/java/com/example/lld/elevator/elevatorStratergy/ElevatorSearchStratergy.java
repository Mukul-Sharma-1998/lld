package com.example.lld.elevator.elevatorStratergy;

import com.example.lld.elevator.Elevator;
import com.example.lld.elevator.Status;

import java.util.List;

public interface ElevatorSearchStratergy {
    public Elevator searchElevator(int currentFloor, List<Elevator> elevators, Status direction);
}
