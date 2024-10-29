package com.example.lld.vendingMachine;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Inventory {
    private Map<Integer, Integer> itemCodeItemQuantityMap;
    private List<Item> itemList;
}
