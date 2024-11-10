package com.example.lld.inventoryManagement.user;

import com.example.lld.inventoryManagement.Product;
import com.example.lld.inventoryManagement.payment.Payment;
import com.example.lld.inventoryManagement.payment.PaymentFactory;
import com.example.lld.inventoryManagement.payment.PaymentMethod;
import com.example.lld.inventoryManagement.payment.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    private int id;
    private String name;
    private String email;
    private Cart cart;
    private List<Order> orderHistory;

    public boolean placeOrder() {
        Payment payment = new Payment(PaymentStatus.PROCESSING, this.cart.getCartPrice(), PaymentMethod.UPI, new PaymentFactory());
        Map<Product, Integer> orderMap = new HashMap<>();
        for(Product product : this.cart.getProductMap().keySet()) {
            orderMap.put(product, this.cart.getProductMap().get(product));
        }
        Order order = new Order(this.cart.getProductMap(), this.cart.getWarehouse(), payment);
        this.orderHistory.add(order);
        this.cart.refresh();
        return true;
    }

    public void makePayment(Order order) {
        order.getPayment().makePayment();
        // TODO: update the warehouse
        for(Product product : order.getMyOrder().keySet()) {
            order.getWarehouse().getInventory().getStock().put(product, order.getWarehouse().getInventory().getStock().get(product) - order.getMyOrder().get(product));
        }

    }
}
