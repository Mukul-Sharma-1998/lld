package com.example.lld.inventoryManagement;

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

    private Map<Product, Integer> stock;

    public void seeInventory() {
        for(Product product : this.stock.keySet()) {
            System.out.println(product + "--->" + this.stock.get(product));
        }
    }
}
