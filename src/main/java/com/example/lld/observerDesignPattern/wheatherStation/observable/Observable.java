package com.example.lld.observerDesignPattern.wheatherStation.observable;

import com.example.lld.observerDesignPattern.wheatherStation.observer.Observer;

public interface Observable {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
    void setData(String data);
    String getData();

}
