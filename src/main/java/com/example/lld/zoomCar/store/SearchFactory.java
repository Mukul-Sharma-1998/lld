package com.example.lld.zoomCar.store;

import com.example.lld.zoomCar.store.searchStratergy.SearchByFuel;
import com.example.lld.zoomCar.store.searchStratergy.SearchStratergy;

public class SearchFactory {
    public SearchStratergy searchByCarType = new SearchByCarType();
    public SearchStratergy searchByFuel = new SearchByFuel();
}
