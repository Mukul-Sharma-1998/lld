package com.example.lld.observerDesignPattern.wheatherStation;

import com.example.lld.observerDesignPattern.wheatherStation.observable.Observable;
import com.example.lld.observerDesignPattern.wheatherStation.observable.WeatherStation;
import com.example.lld.observerDesignPattern.wheatherStation.observer.MobileObserver;
import com.example.lld.observerDesignPattern.wheatherStation.observer.Observer;
import com.example.lld.observerDesignPattern.wheatherStation.observer.RadioObserver;
import com.example.lld.observerDesignPattern.wheatherStation.observer.TvObserver;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        HashSet<Observer> observers = new HashSet<>();
        Observable weatherStation = new WeatherStation("25 degrees", observers);

        Observer tvObserver = new TvObserver(weatherStation);
        weatherStation.addObserver(tvObserver);

        Observer radioObserver = new RadioObserver(weatherStation);
        weatherStation.addObserver(radioObserver);

        Observer mobileObserver = new MobileObserver(weatherStation);
        weatherStation.addObserver(mobileObserver);

        weatherStation.setData("27 degree");
        weatherStation.setData("35 degree");

    }
}
