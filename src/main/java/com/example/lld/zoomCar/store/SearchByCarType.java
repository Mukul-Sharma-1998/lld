package com.example.lld.zoomCar.store;

import com.example.lld.zoomCar.store.searchStratergy.SearchStratergy;
import com.example.lld.zoomCar.vehicle.Vehicle;

import java.util.List;

public class SearchByCarType implements SearchStratergy {
    @Override
    public List<Vehicle> search(List<Vehicle> vehicles, String filter) {
        return (List<Vehicle>) vehicles.get(0);
    }
}
