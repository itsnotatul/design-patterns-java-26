package creationalDesignPattern.factory.FactoryMethod.shape.impl;

import creationalDesignPattern.factory.FactoryMethod.shape.Shape;

public class Circle implements Shape {
    @Override
    public void computeArea() {
        System.out.println("Circle:: computeArea()");
    }

    @Override
    public void draw() {
        System.out.println("Circle:: draw()");
    }
}
