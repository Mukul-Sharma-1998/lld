package com.example.lld.vendingMachine;

import com.example.lld.vendingMachine.stateImpl.IdleState;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item(101, ItemType.COKE, 20);
        Item item2 = new Item(102, ItemType.PEPSI, 15);
        Item item3 = new Item(103, ItemType.LAYS, 10);
        Map<Item, Integer> itemMap = new HashMap<>();
        itemMap.put(item1, 5);
        itemMap.put(item2, 5);
        itemMap.put(item3, 5);
        Inventory inventory = new Inventory(itemMap);

        Map<Coin, Integer> totalCollection = new HashMap<>();
        List<Coin> currentCollection = new ArrayList<>();
        VendingMachine vendingMachine = new VendingMachine(inventory, new IdleState(), totalCollection, currentCollection, 0 , null);

        try {
            vendingMachine.getState().startSelection(vendingMachine);
            vendingMachine.getState().selection(vendingMachine, 101);
            vendingMachine.getState().addMoney(vendingMachine, Coin.TEN);
            vendingMachine.getState().addMoney(vendingMachine, Coin.TEN);
            vendingMachine.getState().confirm(vendingMachine);

            vendingMachine.getState().dispatch(vendingMachine);
            System.out.println(vendingMachine.getSelectedItem());
            System.out.println(vendingMachine.getInventory().getItemTypeQuantity().get(item1));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
