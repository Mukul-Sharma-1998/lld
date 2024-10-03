package com.example.lld.factoryDesignPattern;

public class TriangleImpl implements ShapeStratergy{
    @Override
    public void draw() {
        System.out.println("This is a TRIANGLE");
    }
}
