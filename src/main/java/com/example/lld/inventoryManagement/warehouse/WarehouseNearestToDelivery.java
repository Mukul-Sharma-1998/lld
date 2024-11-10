package com.example.lld.inventoryManagement.warehouse;

import java.util.List;

public class WarehouseNearestToDelivery implements WarehouseSelectionStratergy {
    @Override
    public Warehouse getWarehouse(List<Warehouse> warehouses) {
        return warehouses.get(0);
    }
}
