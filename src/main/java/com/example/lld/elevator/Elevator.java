package com.example.lld.elevator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Elevator {
    InterButton interButton;
    Status status;
    Integer currentFloor;

    public void move(Integer destinationFloor, Status status) {
        this.status = status;
        int currentStartFloor = this.currentFloor;
        if(status.equals(Status.UP)) {
            for(int i=currentStartFloor + 1; i<this.interButton.getButtons().get(this.interButton.getButtons().size() - 1); i++) {
                this.currentFloor = i;
            }
        }
        this.status = Status.IDLE;
    }
}
