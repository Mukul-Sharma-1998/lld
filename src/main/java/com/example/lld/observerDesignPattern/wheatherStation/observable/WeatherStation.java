package com.example.lld.observerDesignPattern.wheatherStation.observable;

import com.example.lld.observerDesignPattern.wheatherStation.observer.Observer;

import java.util.HashSet;

public class WeatherStation implements Observable {
    HashSet<Observer> observers;
    String data;

    public WeatherStation(String data, HashSet<Observer> observers) {
        this.data = data;
        this.observers = observers;

    }
    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: this.observers) {
            observer.update();
        }
    }

    @Override
    public void setData(String data) {
        this.data = data;
        this.notifyObserver();
    }

    @Override
    public String getData() {
        return this.data;
    }
}
