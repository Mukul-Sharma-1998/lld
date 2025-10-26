package com.example.lld.coffeeMachine.coffeeMachineState;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CoffeeMachineStateFactory {
    State idleState;
    State coffeeSelectionState;
    State paymentState;
    State despensingState;


    public void setIdleState(State idleState) {
        this.idleState = idleState;
    }

    public void setCoffeeSelectionState(State coffeeSelectionState) {
        this.coffeeSelectionState = coffeeSelectionState;
    }

    public void setPaymentState(State paymentState) {
        this.paymentState = paymentState;
    }

    public void setDespensingState(State despensingState) {
        this.despensingState = despensingState;
    }




}
