package com.example.lld.inventoryManagement.user;

import com.example.lld.inventoryManagement.Product;
import com.example.lld.inventoryManagement.warehouse.Warehouse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Cart {
    private Map<Product, Integer> productMap;
    private Warehouse warehouse;
    private int cartPrice;

    public void addToCart(Product product, int quantity) {
        if(this.productMap.get(product) != null) {
            this.productMap.put(product, this.productMap.get(product)+quantity);
        } else {
            this.productMap.put(product, quantity);
        }
        this.cartPrice = this.cartPrice + (product.getPrice() * quantity);
    }

    public String toString() {
        return this.productMap.toString();
    }

    public void refresh() {
        this.productMap = new HashMap<>();
        this.cartPrice = 0;
        this.warehouse = null;

    }
}
