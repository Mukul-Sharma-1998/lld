package com.example.lld.vendingMachine.stateImpl;

import com.example.lld.vendingMachine.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class IdleState implements State {
    @Override
    public List<Item> startSelection(VendingMachine vendingMachine) throws Exception {
        System.out.println("You can now start selecting the item");
        List<Item> items = new ArrayList<>();
        for(Map.Entry<Item, Integer> entry: vendingMachine.getInventory().getItemTypeQuantity().entrySet()) {
            if(entry.getValue()>0) {
                System.out.println(entry.getKey().getItemType().toString() + " " + entry.getKey().getPrice() + " " + entry.getKey().getItemCode());
                items.add(entry.getKey());
            }
        }
        vendingMachine.setState(new SelectionState());
        return items;
    }

    @Override
    public int selection(VendingMachine vendingMachine, int itemCode) throws Exception {
        throw new Exception("You are not eligible to select item");
    }

    @Override
    public int cancel(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You are not eligible to for cancellation");
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
