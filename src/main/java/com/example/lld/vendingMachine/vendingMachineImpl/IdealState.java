package com.example.lld.vendingMachine.vendingMachineImpl;

import com.example.lld.vendingMachine.Coin;
import com.example.lld.vendingMachine.Item;
import com.example.lld.vendingMachine.VendingMachine;
import com.example.lld.vendingMachine.VendingMachineState;

public class IdealState implements VendingMachineState {
    @Override
    public void startSelection(VendingMachine vendingMachine) throws Exception{
        System.out.println("|");
        System.out.println("Ideal state");

        for(Item item : vendingMachine.getInventory().getItemList()) {
            if(vendingMachine.getInventory().getItemCodeItemQuantityMap().get(item.getItemCode()) > 0) {
                System.out.println(item);
            }
        }
        vendingMachine.setState(new SelectionState());
        System.out.println("|");
    }

    @Override
    public void selectItem(VendingMachine vendingMachine, int itemCode) throws Exception {
        throw new Exception("You are not authorized to perform selection now!");
    }

    @Override
    public void cancel(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You are not authorized to perform cancellation now!");
    }

    @Override
    public void depositMoney(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("You are not authorized to perform deposit now!");
    }

    @Override
    public void confirm(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You are not authorized to perform confirmation now!");
    }

    @Override
    public void dispatch(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You are not authorized to perform dispatch now!");
    }
}
