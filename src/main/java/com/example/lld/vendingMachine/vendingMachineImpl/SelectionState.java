package com.example.lld.vendingMachine.vendingMachineImpl;

import com.example.lld.vendingMachine.Coin;
import com.example.lld.vendingMachine.Item;
import com.example.lld.vendingMachine.VendingMachine;
import com.example.lld.vendingMachine.VendingMachineState;

public class SelectionState implements VendingMachineState {



    @Override
    public void startSelection(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You are not authorized to start selection now!");
    }

    @Override
    public void selectItem(VendingMachine vendingMachine, int itemCode) throws Exception {
        System.out.println("|");
        System.out.println("Selection state");

        if(vendingMachine.getInventory().getItemCodeItemQuantityMap().get(itemCode) <= 0) {
            System.out.println("Selected item is not in stock, please try again");
            vendingMachine.setState(new IdealState());
            return;
        }
        Item selectedItem = null;
        for(Item item : vendingMachine.getInventory().getItemList()) {
            if(item.getItemCode() == itemCode) {
                selectedItem = item;

                break;
            }
        }
        if(selectedItem == null) {
            System.out.println("Invalid entry, try again");
            vendingMachine.setState(new IdealState());
            return;
        }
        System.out.println("Amount to be added: " + selectedItem.getItemPrice());
        AddMoney addMoney = new AddMoney();
        addMoney.setSelectedItem(selectedItem);
        vendingMachine.setState(addMoney);
        System.out.println("|");

    }

    @Override
    public void cancel(VendingMachine vendingMachine) throws Exception {
        System.out.println("Cancellation successful: Back to ideal state");
        vendingMachine.setState(new IdealState());
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
