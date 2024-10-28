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
public class VendingMachine {
    private Inventory inventory;
    private State state;
    private Map<Coin, Integer> totalCollection;
    private List<Coin> currentCollection;
    private Integer currentTotal;
    private Item selectedItem;
}
