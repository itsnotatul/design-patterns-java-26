package creationalDesignPattern.factory.simpleFactoryPattern.shape.impl;

import creationalDesignPattern.factory.simpleFactoryPattern.shape.Shape;

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
