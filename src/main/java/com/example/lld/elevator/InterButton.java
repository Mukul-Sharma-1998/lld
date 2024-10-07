package com.example.lld.elevator;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class InterButton {
    List<Integer> buttons;
    Elevator elevator;

    public void moveElevator(Integer destinationFloor) {
        Status status;
        if(destinationFloor > this.elevator.currentFloor) {
            status = Status.UP;
        } else {
            status = Status.DOWN;
        }
        elevator.move(destinationFloor, status);

    }

}
