package com.example.lld.elevator;

import com.example.lld.elevator.elevatorStratergy.SearchStratergyIdentifier;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Floor {
    int floorNumber;
    ElevatorManager elevatorManager;
    SearchStratergyIdentifier searchStratergyIdentifier;

    public Elevator getElevator(Status direction) {
        return this.elevatorManager.fetchElevator(this.floorNumber, this.searchStratergyIdentifier, direction);
    }
}
