package com.example.lld.factoryDesignPattern;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        FactoryOfShapeStratergy shapeFactory = new FactoryOfShapeStratergy();
        ShapeStratergy circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        ShapeStratergy triangle = shapeFactory.getShape("TRIANGLE");
        triangle.draw();

    }
}
