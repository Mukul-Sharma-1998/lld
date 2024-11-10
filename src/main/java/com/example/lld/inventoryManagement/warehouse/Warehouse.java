package com.example.lld.inventoryManagement.warehouse;

import com.example.lld.inventoryManagement.Address;
import com.example.lld.inventoryManagement.Inventory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Warehouse {
    private Inventory inventory;
    private Address address;


}
