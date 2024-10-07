package com.example.lld.zoomCar;

import com.example.lld.zoomCar.payment.PaymentFactory;
import com.example.lld.zoomCar.payment.PaymentIdentifier;
import com.example.lld.zoomCar.store.Store;
import com.example.lld.zoomCar.vehicle.Vehicle;

import java.util.List;

public class ZoomCar {
    List<Store> stores;
    PaymentFactory paymentFactory;

    public List<Store> searchStore(Location userLocation) {
        return (List<Store>) this.stores.get(0);
    }

    public Booking bookVehicle(Store store, Vehicle vehicle, User user) {
        return store.getCarStoreManager().createBooking(vehicle, user);

    }

    public void makePayment(Booking booking, PaymentIdentifier paymentIdentifier) {
        paymentFactory.getPaymentByCard().makePayment(booking);
    }
}
