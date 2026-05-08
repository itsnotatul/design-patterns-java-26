package creationalDesignPattern.factory.simpleFactoryPattern;

import creationalDesignPattern.factory.simpleFactoryPattern.enums.ShapeType;
import creationalDesignPattern.factory.simpleFactoryPattern.shape.Shape;
import creationalDesignPattern.factory.simpleFactoryPattern.shapeFactory.ShapeFactory;

public class SimpleFactoryDemo {
    public static void main(String[] args) {
        System.out.println("======= Simple Factory Pattern Demo ===========");

        Shape circleShape = ShapeFactory.createShapeInstance(ShapeType.CIRCLE);
        Shape rectangleShape = ShapeFactory.createShapeInstance(ShapeType.RECTANGLE);

        circleShape.computeArea();
        rectangleShape.draw();
    }
}
