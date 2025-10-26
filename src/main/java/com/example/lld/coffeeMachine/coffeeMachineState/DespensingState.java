package com.example.lld.coffeeMachine.coffeeMachineState;

import com.example.lld.coffeeMachine.CoffeeInventory;
import com.example.lld.coffeeMachine.CoffeeMachine;
import com.example.lld.coffeeMachine.CoffeeType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class DespensingState implements State{
    CoffeeMachineStateFactory coffeeMachineStateFactory;
    CoffeeInventory coffeeInventory;

    @Override
    public void startSelection(CoffeeMachine coffeeMachine) throws Exception {
        throw new Exception("This action is invalid!");
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
        System.out.println("despensing the coffee");
        // updating the inventory
        System.out.println("Update Inventory");
        coffeeMachine.setCoffeeMachineState(coffeeMachineStateFactory.getIdleState());
    }

    @Override
    public void cancel(CoffeeMachine coffeeMachine) throws Exception {
        throw new Exception("This action is invalid");
    }
}
