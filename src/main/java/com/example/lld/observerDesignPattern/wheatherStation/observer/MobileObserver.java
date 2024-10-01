package com.example.lld.observerDesignPattern.wheatherStation.observer;

import com.example.lld.observerDesignPattern.wheatherStation.observable.Observable;

public class MobileObserver implements Observer{
    Observable observable;

    public MobileObserver(Observable observable) {
        this.observable = observable;
    }
    @Override
    public void update() {
        System.out.println("Notification to MobileObserver for temperature update : " + this.observable.getData() );
    }
}
