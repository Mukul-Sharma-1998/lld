package com.example.lld.coffeeMachine.coffeeMachineState;

import com.example.lld.coffeeMachine.CoffeeMachine;
import com.example.lld.coffeeMachine.CoffeeType;
import com.example.lld.coffeeMachine.payment.PaymentFactory;
import com.example.lld.coffeeMachine.payment.PaymentMethod;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class PaymentState implements State{
    CoffeeMachineStateFactory coffeeMachineStateFactory;
    PaymentFactory paymentFactory;

    @Override
    public void startSelection(CoffeeMachine coffeeMachine) throws Exception {
        throw new Exception("This action is invalid!");
    }

    @Override
    public void enterCoffeeType(CoffeeMachine coffeeMachine, CoffeeType coffeeType) throws Exception {
        throw new Exception("This action is invalid!");
    }

    @Override
    public void makePayment(CoffeeMachine coffeeMachine, String paymentMethod, CoffeeType coffeeType) throws Exception {
        this.paymentFactory.getPayment(paymentMethod).pay();
        coffeeMachine.setCoffeeMachineState(coffeeMachineStateFactory.getDespensingState());
        coffeeMachine.getCoffeeMachineState().despenseCoffee(coffeeMachine, coffeeType);
    }

    @Override
    public void despenseCoffee(CoffeeMachine coffeeMachine, CoffeeType coffeeType) throws  Exception {
        throw new Exception("This action is invalid!");
    }

    @Override
    public void cancel(CoffeeMachine coffeeMachine) throws Exception {
        System.out.println("Back to idle state from payment state");
        coffeeMachine.setCoffeeMachineState(new IdleState());
    }
}
