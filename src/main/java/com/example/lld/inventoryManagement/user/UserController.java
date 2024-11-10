package com.example.lld.inventoryManagement.user;

import com.example.lld.inventoryManagement.Product;
import com.example.lld.inventoryManagement.warehouse.Warehouse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserController {
    private List<User> users;

    public void connetToWareHouse(User user, Warehouse warehouse) {
        user.getCart().setWarehouse(warehouse);
    }

    public void addToCart(User user, Product product, int quantity) {
        user.getCart().addToCart(product, quantity);
    }

    public void placeOrder(User user) {
        user.placeOrder();
    }

}
