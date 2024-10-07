package com.example.lld.elevator;

import com.example.lld.elevator.elevatorStratergy.ElevatorSearchFactory;
import com.example.lld.elevator.elevatorStratergy.ElevatorSearchStratergy;
import com.example.lld.elevator.elevatorStratergy.SearchStratergyIdentifier;

import java.util.List;

public class ElevatorManager {
    List<Elevator> elevators;
    ElevatorSearchFactory elevatorSearchFactory;

    public Elevator fetchElevator(int currentFloor, SearchStratergyIdentifier stratergyIdentifier, Status direction) {
        ElevatorSearchStratergy elevatorSearchStratergy;
        switch (stratergyIdentifier) {
            case TIME -> {
                elevatorSearchStratergy = elevatorSearchFactory.getElevatorSearchByTime();
            }
            case CUSTOM -> {
                elevatorSearchStratergy = elevatorSearchFactory.getElevatorSearchByCustom();
            }
            default -> {
                elevatorSearchStratergy = elevatorSearchFactory.getElevatorSearchByDefault();
            }
        }

        return elevatorSearchStratergy.searchElevator(currentFloor, this.elevators, direction);
    }
}
