package com.example.lld.vendingMachine;

import com.example.lld.vendingMachine.vendingMachineImpl.IdealState;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item(101, ItemType.COKE, 20);
        Item item2 = new Item(102, ItemType.PEPSI, 30);
        Item item3 = new Item(103, ItemType.LAYS, 10);

        Map<Integer, Integer> itemCodeItemQuantity = new HashMap<>();
        itemCodeItemQuantity.put(item1.getItemCode(), 10);
        itemCodeItemQuantity.put(item2.getItemCode(), 10);
        itemCodeItemQuantity.put(item3.getItemCode(), 10);

        List<Item> items = Arrays.asList(item1, item2, item3);

        Inventory inventory = new Inventory(itemCodeItemQuantity, items);

        Map<Coin, Integer> totalBalance = new HashMap<>();
        VendingMachine vendingMachine = new VendingMachine(new IdealState(), inventory, totalBalance);

        try {
            vendingMachine.getState().startSelection(vendingMachine);
//            vendingMachine.getState().cancel(vendingMachine);
            vendingMachine.getState().selectItem(vendingMachine, 102);
//            vendingMachine.getState().cancel(vendingMachine);
            vendingMachine.getState().depositMoney(vendingMachine, Coin.TEN);
            vendingMachine.getState().depositMoney(vendingMachine, Coin.TEN);
            vendingMachine.getState().depositMoney(vendingMachine, Coin.TEN);
            vendingMachine.getState().confirm(vendingMachine);
            vendingMachine.getState().dispatch(vendingMachine);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
