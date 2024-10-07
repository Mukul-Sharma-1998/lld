package com.example.lld.elevator.elevatorStratergy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ElevatorSearchFactory {

    ElevatorSearchStratergy elevatorSearchByTime = new ElevatorSerachByTime();
    ElevatorSearchStratergy elevatorSearchByCustom = new ElevatorSearchByCustom();
    ElevatorSearchStratergy elevatorSearchByDefault = new ElevatorSearchByDefault();

}
