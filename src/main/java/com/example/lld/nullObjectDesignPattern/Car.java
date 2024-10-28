package com.example.lld.nullObjectDesignPattern;

public class Car implements Vehicle{
    @Override
    public int getPeopleCapacity() {
        return 5;
    }

    @Override
    public int getTankCapaticy() {
        return 40;
    }
}
