package com.example.lld.factoryDesignPattern;

public class CircleImpl implements ShapeStratergy{
    @Override
    public void draw() {
        System.out.println("This is a CIRCLE");
    }
}
