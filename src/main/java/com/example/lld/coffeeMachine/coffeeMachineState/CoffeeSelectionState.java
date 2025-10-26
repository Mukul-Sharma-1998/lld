package com.example.lld.coffeeMachine.coffeeMachineState;

import com.example.lld.coffeeMachine.CoffeeMachine;
import com.example.lld.coffeeMachine.CoffeeType;
import com.example.lld.coffeeMachine.payment.PaymentMethod;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class CoffeeSelectionState implements State{
    CoffeeMachineStateFactory coffeeMachineStateFactory;

    @Override
    public void startSelection(CoffeeMachine coffeeMachine) throws Exception {
        throw new Exception("This action is invalid!");
    }

    @Override
    public void enterCoffeeType(CoffeeMachine coffeeMachine, CoffeeType coffeeType) {
        System.out.println("Selection State");
        coffeeMachine.setCoffeeMachineState(coffeeMachineStateFactory.getPaymentState());
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
        System.out.println("Back to ideal");
        coffeeMachine.setCoffeeMachineState(new IdleState());
    }
}
