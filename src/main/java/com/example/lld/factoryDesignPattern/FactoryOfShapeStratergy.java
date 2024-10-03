package com.example.lld.factoryDesignPattern;

public class FactoryOfShapeStratergy {

    public ShapeStratergy getShape(String shape) {
        switch (shape) {
            case "CIRCLE":
                return new CircleImpl();

            case "TRIANGLE":
                return new TriangleImpl();

            default:
                return null;
        }
    }
}
