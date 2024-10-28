package com.example.lld.vendingMachine.stateImpl;

import com.example.lld.vendingMachine.Coin;
import com.example.lld.vendingMachine.Item;
import com.example.lld.vendingMachine.State;
import com.example.lld.vendingMachine.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class AddMoneyState implements State {
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
        vendingMachine.setCurrentCollection(new ArrayList<>());
        return refundAmount;
    }

    @Override
    public void proceed(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You are not eligible to proceed");
    }

    @Override
    public int addMoney(VendingMachine vendingMachine, Coin coin) throws Exception {
        vendingMachine.getCurrentCollection().add(coin);
        vendingMachine.setCurrentTotal(vendingMachine.getCurrentTotal() + coin.getValue());
        return vendingMachine.getCurrentTotal();
    }

    @Override
    public void confirm(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setState(new DispatchState());
    }

    @Override
    public int dispatch(VendingMachine vendingMachine) throws Exception {
        throw new Exception("You are not eligible to dispatch item");
    }
}
