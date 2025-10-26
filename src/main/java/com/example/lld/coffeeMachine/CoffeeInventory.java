package com.example.lld.coffeeMachine;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CoffeeInventory {
    Map<CoffeeType, Boolean> coffeeInventoryList;
}
