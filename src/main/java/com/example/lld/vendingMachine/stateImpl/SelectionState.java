package com.example.lld.vendingMachine.stateImpl;

import com.example.lld.vendingMachine.Coin;
import com.example.lld.vendingMachine.Item;
import com.example.lld.vendingMachine.State;
import com.example.lld.vendingMachine.VendingMachine;

import java.util.List;
import java.util.Map;

public class SelectionState implements State {
    @Override
    public List<Item> startSelection(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You are not eligible to start selection");
    }

    @Override
    public int selection(VendingMachine vendingMachine, int itemCode) throws Exception {
        Item selectedItem = null;
        for(Map.Entry<Item, Integer> entry: vendingMachine.getInventory().getItemTypeQuantity().entrySet()) {
            if(entry.getKey().getItemCode() == itemCode) {
                selectedItem = entry.getKey();
                break;
            }
        }
        if (selectedItem == null) {
            System.out.println("Wrong Item code, try again");
            throw new Exception("Wrong item code");
        }
        System.out.println("Selected Item: " + selectedItem.getItemCode());
        vendingMachine.setSelectedItem(selectedItem);
        vendingMachine.setState(new AddMoneyState());
        return  itemCode;
    }

    @Override
    public int cancel(VendingMachine vendingMachine) throws Exception {
        System.out.println("You have cancelled the order");
        vendingMachine.setState(new IdleState());
        return 0;
    }

    @Override
    public void proceed(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You are not eligible to proceed");
    }

    @Override
    public int addMoney(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("You are not eligible to add money");
    }

    @Override
    public void confirm(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You are not eligible to confirm");
    }

    @Override
    public int dispatch(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You are not eligible to dispatch item");
    }
}
