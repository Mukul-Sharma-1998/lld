package com.example.lld.inventoryManagement;

import com.example.lld.inventoryManagement.user.UserController;
import com.example.lld.inventoryManagement.warehouse.WarehouseController;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Blinket {
    private WarehouseController warehouseController;
    private UserController userController;
}
