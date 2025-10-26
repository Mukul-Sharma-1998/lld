package com.example.lld.coffeeMachine;

import com.example.lld.atm.state.IdealState;
import com.example.lld.coffeeMachine.coffeeMachineState.*;
import com.example.lld.coffeeMachine.payment.CashPayment;
import com.example.lld.coffeeMachine.payment.PaymentFactory;
import com.example.lld.coffeeMachine.payment.UpiPayment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
        CoffeeMachineStateFactory coffeeMachineStateFactory = new CoffeeMachineStateFactory();
        PaymentFactory paymentFactory = new PaymentFactory(
                new CashPayment(),
                new UpiPayment()
        );
        Map<CoffeeType, Boolean> inventory = new HashMap<>();
        inventory.put(CoffeeType.ESPRESSO, true);
        inventory.put(CoffeeType.LATTE, true);
        inventory.put(CoffeeType.COLD, true);
        inventory.put(CoffeeType.HOT, true);

        CoffeeInventory coffeeInventory = new CoffeeInventory(inventory);
        State idealState = new IdleState(coffeeMachineStateFactory);
        State coffeeSelectionState = new CoffeeSelectionState(coffeeMachineStateFactory);
        State paymentState = new PaymentState(coffeeMachineStateFactory, paymentFactory);
        State despensingState = new DespensingState(coffeeMachineStateFactory, coffeeInventory);
        coffeeMachineStateFactory.setIdleState(idealState);
        coffeeMachineStateFactory.setCoffeeSelectionState(coffeeSelectionState);
        coffeeMachineStateFactory.setPaymentState(paymentState);
        coffeeMachineStateFactory.setDespensingState(despensingState);

        CoffeeMachine coffeeMachine = new CoffeeMachine(idealState);

        coffeeMachine.coffeeMachineState.startSelection(coffeeMachine);
        coffeeMachine.coffeeMachineState.enterCoffeeType(coffeeMachine, CoffeeType.COLD);
        coffeeMachine.coffeeMachineState.cancel(coffeeMachine);
    }


}
