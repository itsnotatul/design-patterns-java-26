package creationalDesignPattern.factory.simpleFactoryPattern.shape.impl;

import creationalDesignPattern.factory.simpleFactoryPattern.shape.Shape;

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
