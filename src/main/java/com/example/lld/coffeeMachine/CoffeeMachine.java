package com.example.lld.coffeeMachine;

import com.example.lld.coffeeMachine.coffeeMachineState.State;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CoffeeMachine {
    State coffeeMachineState;
}
