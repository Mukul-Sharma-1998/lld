package com.example.lld.vendingMachine;

import java.util.List;

public interface State {
    public List<Item> startSelection(VendingMachine vendingMachine) throws Exception;
    public int selection(VendingMachine vendingMachine, int itemCode) throws Exception;
    public int cancel(VendingMachine vendingMachine) throws Exception;
    public void proceed(VendingMachine vendingMachine) throws Exception;
    public int addMoney(VendingMachine vendingMachine, Coin coin) throws Exception;
    public void confirm(VendingMachine vendingMachine) throws Exception;
    public int dispatch(VendingMachine vendingMachine) throws Exception;
}
