package com.example.lld.zoomCar.store.searchStratergy;

import com.example.lld.zoomCar.vehicle.Vehicle;

import java.util.List;

public interface SearchStratergy {

    public List<Vehicle> search(List<Vehicle> vehicles, String filter);
}
