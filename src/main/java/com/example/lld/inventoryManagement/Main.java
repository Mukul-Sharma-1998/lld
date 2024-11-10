package com.example.lld.inventoryManagement;

import com.example.lld.inventoryManagement.user.Cart;
import com.example.lld.inventoryManagement.user.Order;
import com.example.lld.inventoryManagement.user.User;
import com.example.lld.inventoryManagement.user.UserController;
import com.example.lld.inventoryManagement.warehouse.Warehouse;
import com.example.lld.inventoryManagement.warehouse.WarehouseController;
import com.example.lld.inventoryManagement.warehouse.WarehouseSelectionFactory;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        WarehouseController warehouseController = new WarehouseController();
        UserController userController = new UserController();


        Map<Product, Integer> cartMap = new HashMap<>();
        Cart cart = new Cart(cartMap, null, 0);
        List<Order> orderHistory = new ArrayList<>();
        User user = new User(1, "Mukul", "mukul00912@gmail.com", cart, orderHistory);
        userController.setUsers(Arrays.asList(user));


        Product product = new Product(1, Category.SNACKS, "Snickers", 80);
        Map<Product, Integer> productIntegerMap = new HashMap<>();
        productIntegerMap.put(product, 90);
        Inventory inventory = new Inventory(productIntegerMap);
        Address address = new Address("New Delhi", "Delhi", "India", "110023");
        Warehouse warehouse = new Warehouse(inventory, address);
        warehouseController.setWarehouses(Arrays.asList(warehouse));
        warehouseController.setWarehouseSelectionFactory(new WarehouseSelectionFactory());


        Blinket blinket = new Blinket(warehouseController, userController);
        Warehouse w1 = blinket.getWarehouseController().getWarehouse();
        userController.connetToWareHouse(user, w1);
        w1.getInventory().seeInventory();

        userController.addToCart(user, product, 15);

        System.out.println(user.getCart());

        userController.placeOrder(user);
        System.out.println(user.getOrderHistory().get(0).getMyOrder());
        System.out.println(user.getOrderHistory().get(0).getPayment().getPrice());
        System.out.println(user.getOrderHistory().get(0).getPayment().getPaymentStatus());
        System.out.println(user.getCart());
        user.makePayment(user.getOrderHistory().get(0));

        System.out.println(user.getOrderHistory().get(0).getPayment().getPaymentStatus());

        w1.getInventory().seeInventory();


    }
}
