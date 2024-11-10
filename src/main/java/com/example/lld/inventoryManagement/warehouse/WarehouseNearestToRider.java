package com.example.lld.inventoryManagement.warehouse;

import java.util.List;

public class WarehouseNearestToRider implements WarehouseSelectionStratergy {
    @Override
    public Warehouse getWarehouse(List<Warehouse> warehouses) {
        return warehouses.get(0);
    }
}
