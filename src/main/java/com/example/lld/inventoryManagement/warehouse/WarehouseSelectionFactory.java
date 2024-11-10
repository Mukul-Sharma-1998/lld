package com.example.lld.inventoryManagement.warehouse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WarehouseSelectionFactory {
    private WarehouseSelectionStratergy warehouseNearestToDelivery = new WarehouseNearestToDelivery();
    private WarehouseSelectionStratergy warehouseNearestToRider = new WarehouseNearestToRider();
}
