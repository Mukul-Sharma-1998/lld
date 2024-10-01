package com.example.lld.observerDesignPattern.wheatherStation.observer;

import com.example.lld.observerDesignPattern.wheatherStation.observable.Observable;

public class RadioObserver implements Observer{
    Observable observable;

    public  RadioObserver(Observable observable) {
        this.observable = observable;
    }
    @Override
    public void update() {
        System.out.println("Notification to RadioObserver for temperature update : " + this.observable.getData());
    }
}
