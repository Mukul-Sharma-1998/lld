package com.example.lld.inventoryManagement.user;

import com.example.lld.inventoryManagement.Product;
import com.example.lld.inventoryManagement.payment.Payment;
import com.example.lld.inventoryManagement.warehouse.Warehouse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Order {
    private Map<Product, Integer> myOrder;
    private Warehouse warehouse;
    private Payment payment;


}
