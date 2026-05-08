package creationalDesignPattern.factory.FactoryMethod.shapeFactory;

import creationalDesignPattern.factory.FactoryMethod.enums.ShapeType;
import creationalDesignPattern.factory.FactoryMethod.shape.Shape;
import creationalDesignPattern.factory.FactoryMethod.shapeFactory.impl.CircleFactory;
import creationalDesignPattern.factory.FactoryMethod.shapeFactory.impl.RectangleFactory;
import creationalDesignPattern.factory.FactoryMethod.shapeFactory.impl.SquareFactory;

/**
 * Now it's an abstract class -> subclasses will implement the method createShapeInstance
 * We can say:
 * if number of products = n
 * then n subclasses will extend this abstract class i.e. -> each product has its own factory class(which has one abstract method)
 * -> "each product has its own factory method"
 */
public abstract class ShapeFactory {

    public abstract Shape createShapeInstance();

    public static Shape getShapeInstance(ShapeType shapeType){
        if(shapeType == null) return null;

        Shape shape = null;
        switch(shapeType){
            case CIRCLE -> {
                ShapeFactory circleFactory = new CircleFactory();
                shape = circleFactory.createShapeInstance();
            }
            case SQUARE -> {
                ShapeFactory squareFactory = new SquareFactory();
                shape = squareFactory.createShapeInstance();
            }
            case RECTANGLE -> {
                ShapeFactory rectangleFactory = new RectangleFactory();
                shape = rectangleFactory.createShapeInstance();
            }
            default -> throw new IllegalArgumentException("ShapeType doesn't exist");
        }
        return shape;
    }

}
