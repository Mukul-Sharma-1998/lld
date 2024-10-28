package com.example.lld.vendingMachine.stateImpl;

import com.example.lld.vendingMachine.Coin;
import com.example.lld.vendingMachine.Item;
import com.example.lld.vendingMachine.State;
import com.example.lld.vendingMachine.VendingMachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DispatchState implements State {
    @Override
    public List<Item> startSelection(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You are not eligible to start selection");
    }

    @Override
    public int selection(VendingMachine vendingMachine, int itemCode) throws Exception {
        throw new Exception("You are not eligible to select item");
    }

    @Override
    public int cancel(VendingMachine vendingMachine) throws Exception {
        Integer refundAmount = vendingMachine.getCurrentTotal();
        System.out.println("Refunded amount: " + refundAmount);
        vendingMachine.setCurrentTotal(0);
        vendingMachine.setSelectedItem(null);
        return refundAmount;
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

        if(vendingMachine.getSelectedItem().getPrice() > vendingMachine.getCurrentTotal()) {
            this.cancel(vendingMachine);
        }

        System.out.println("Your item is dispatched, please collect it from the bottom");

        for(Coin coin : vendingMachine.getCurrentCollection()) {
            Integer prev = 0;
            if(vendingMachine.getTotalCollection().get(coin) != null) {
                prev = vendingMachine.getTotalCollection().get(coin);
            }
            vendingMachine.getTotalCollection().put(coin, prev + 1);
        }
        vendingMachine.setCurrentCollection(new ArrayList<>());
        vendingMachine.setCurrentTotal(0);
        vendingMachine.getInventory().getItemTypeQuantity().put(vendingMachine.getSelectedItem(), vendingMachine.getInventory().getItemTypeQuantity().get(vendingMachine.getSelectedItem()) - 1);
        vendingMachine.setSelectedItem(null);
        Map<Item, Integer> itemInventory = vendingMachine.getInventory().getItemTypeQuantity();
        vendingMachine.setState(new IdleState());
        return 0;

    }
}
