package creationalDesignPattern.factory.FactoryMethod.shapeFactory.impl;

import creationalDesignPattern.factory.FactoryMethod.shape.Shape;
import creationalDesignPattern.factory.FactoryMethod.shape.impl.Rectangle;
import creationalDesignPattern.factory.FactoryMethod.shapeFactory.ShapeFactory;

public class RectangleFactory extends ShapeFactory {
    @Override
    public Shape createShapeInstance() {
        return new Rectangle();
    }
}
