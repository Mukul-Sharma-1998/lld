package com.example.lld.vendingMachine;

public interface VendingMachineState {

    public void startSelection(VendingMachine vendingMachine) throws Exception;
    public void selectItem(VendingMachine vendingMachine, int itemCode) throws Exception;
    public void cancel(VendingMachine vendingMachine) throws Exception;
    public void depositMoney(VendingMachine vendingMachine, Coin coin) throws Exception;
    public void  confirm(VendingMachine vendingMachine) throws Exception;
    public void dispatch(VendingMachine vendingMachine) throws Exception;
}
