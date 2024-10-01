package com.example.lld.observerDesignPattern.wheatherStation.observer;

import com.example.lld.observerDesignPattern.wheatherStation.observable.Observable;

public class TvObserver implements Observer{
    Observable observable;

    public TvObserver(Observable observable) {
        this.observable = observable;
    }
    @Override
    public void update() {
        System.out.println("Notification to TvObserver for temperature update : " + this.observable.getData());
    }
}
