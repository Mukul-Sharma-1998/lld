package com.example.lld.zoomCar.store;

import com.example.lld.zoomCar.Booking;
import com.example.lld.zoomCar.User;
import com.example.lld.zoomCar.store.searchStratergy.SearchStratergyType;
import com.example.lld.zoomCar.vehicle.Vehicle;

import java.util.List;

public class BikeStoreManager extends StoreManager{
    @Override
    public List<Vehicle> searchVehicle(SearchStratergyType searchStratergyType) {
        return null;
    }

    @Override
    public Booking createBooking(Vehicle vehicle, User user) {
        return null;
    }
}
