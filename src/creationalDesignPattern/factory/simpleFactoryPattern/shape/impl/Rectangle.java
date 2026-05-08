package creationalDesignPattern.factory.simpleFactoryPattern.shape.impl;

import creationalDesignPattern.factory.simpleFactoryPattern.shape.Shape;

public class Rectangle implements Shape {
    @Override
    public void computeArea() {
        System.out.println("Rectangle:: computeArea()");
    }

    @Override
    public void draw() {
        System.out.println("Rectangle:: draw()");
    }
}
