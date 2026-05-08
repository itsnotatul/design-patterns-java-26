package creationalDesignPattern.factory.FactoryMethod.shapeFactory.impl;

import creationalDesignPattern.factory.FactoryMethod.shape.Shape;
import creationalDesignPattern.factory.FactoryMethod.shape.impl.Square;
import creationalDesignPattern.factory.FactoryMethod.shapeFactory.ShapeFactory;

public class SquareFactory extends ShapeFactory {
    @Override
    public Shape createShapeInstance() {
        return new Square();
    }
}
