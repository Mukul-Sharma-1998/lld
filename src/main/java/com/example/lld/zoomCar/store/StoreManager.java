package com.example.lld.zoomCar.store;

import com.example.lld.zoomCar.Booking;
import com.example.lld.zoomCar.User;
import com.example.lld.zoomCar.store.searchStratergy.SearchStratergyType;
import com.example.lld.zoomCar.vehicle.Vehicle;

import java.util.List;

public abstract class StoreManager {
    List<Vehicle> vehicles;
    List<Booking> bookings;
    SearchFactory searchFactory;

    public abstract List<Vehicle> searchVehicle(SearchStratergyType searchStratergyType);

    public abstract Booking createBooking(Vehicle vehicle, User user);
}
