package com.example.lld.coffeeMachine.coffeeMachineState;

import com.example.lld.coffeeMachine.CoffeeMachine;
import com.example.lld.coffeeMachine.CoffeeType;
import com.example.lld.coffeeMachine.payment.PaymentMethod;

public interface State {

    public void startSelection(CoffeeMachine coffeeMachine) throws Exception;
    public void enterCoffeeType(CoffeeMachine coffeeMachine, CoffeeType coffeeType) throws Exception;
    public void makePayment(CoffeeMachine coffeeMachine, String paymentMethod, CoffeeType coffeeType) throws Exception;
    public void despenseCoffee(CoffeeMachine coffeeMachine, CoffeeType coffeeType) throws Exception;
    public void cancel(CoffeeMachine coffeeMachine) throws Exception;
}
