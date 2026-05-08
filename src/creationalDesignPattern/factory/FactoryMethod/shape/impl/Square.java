package creationalDesignPattern.factory.FactoryMethod.shape.impl;

import creationalDesignPattern.factory.FactoryMethod.shape.Shape;

public class Square implements Shape {
    @Override
    public void computeArea() {
        System.out.println("Square:: computeArea()");
    }

    @Override
    public void draw() {
        System.out.println("Square:: draw()");
    }
}
