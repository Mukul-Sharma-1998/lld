package com.example.lld.inventoryManagement;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {
    private int id;
    private Category category;
    private String name;
    private int price;

    public String toString() {
        return this.getName() + " " + this.getPrice() + " " + this.getCategory();
    }
}
