package com.example.lld.nullObjectDesignPattern;

public class NullVehicle implements Vehicle{
    @Override
    public int getPeopleCapacity() {
        return 0;
    }

    @Override
    public int getTankCapaticy() {
        return 0;
    }
}
