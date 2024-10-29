package com.example.lld.vendingMachine;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class VendingMachine {
    private VendingMachineState state;
    private Inventory inventory;
    private Map<Coin, Integer> totalBalance;
}
