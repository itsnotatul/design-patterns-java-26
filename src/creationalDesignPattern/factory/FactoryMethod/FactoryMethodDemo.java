package creationalDesignPattern.factory.FactoryMethod;

import creationalDesignPattern.factory.FactoryMethod.enums.ShapeType;
import creationalDesignPattern.factory.FactoryMethod.shape.Shape;
import creationalDesignPattern.factory.FactoryMethod.shapeFactory.ShapeFactory;

import static creationalDesignPattern.factory.FactoryMethod.shapeFactory.ShapeFactory.getShapeInstance;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        System.out.println("======= Factory Method Demo ===========");

        Shape circleShape = getShapeInstance(ShapeType.CIRCLE);
        Shape rectangleShape = getShapeInstance(ShapeType.RECTANGLE);

        circleShape.computeArea();
        rectangleShape.draw();
    }
}
