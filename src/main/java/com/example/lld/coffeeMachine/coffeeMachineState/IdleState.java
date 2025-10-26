package com.example.lld.coffeeMachine.coffeeMachineState;

import com.example.lld.coffeeMachine.CoffeeMachine;
import com.example.lld.coffeeMachine.CoffeeType;
import com.example.lld.coffeeMachine.payment.PaymentMethod;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class IdleState implements State{
    CoffeeMachineStateFactory coffeeMachineStateFactory;

    @Override
    public void startSelection(CoffeeMachine coffeeMachine) {
        System.out.println("Ideal State");
        coffeeMachine.setCoffeeMachineState(coffeeMachineStateFactory.getCoffeeSelectionState());
    }

    @Override
    public void enterCoffeeType(CoffeeMachine coffeeMachine, CoffeeType coffeeType) throws Exception {
        throw new Exception("This action is invalid!");
    }

    @Override
    public void makePayment(CoffeeMachine coffeeMachine, String paymentMethod, CoffeeType coffeeType) throws  Exception {
        throw new Exception("This action is invalid!");
    }

    @Override
    public void despenseCoffee(CoffeeMachine coffeeMachine, CoffeeType coffeeType) throws  Exception {
        throw new Exception("This action is invalid!");
    }

    @Override
    public void cancel(CoffeeMachine coffeeMachine) throws Exception {
        throw new Exception("This action is invalid");
    }
}
