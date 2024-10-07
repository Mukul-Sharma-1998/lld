package com.example.lld.zoomCar.store;

import com.example.lld.zoomCar.Location;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Store {
    int storeId;
    Location location;
    StoreManager carStoreManager;
    StoreManager bikeStoreManager;
}
