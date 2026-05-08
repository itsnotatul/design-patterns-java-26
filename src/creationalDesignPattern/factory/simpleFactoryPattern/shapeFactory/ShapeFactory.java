package creationalDesignPattern.factory.simpleFactoryPattern.shapeFactory;

import creationalDesignPattern.factory.simpleFactoryPattern.enums.ShapeType;
import creationalDesignPattern.factory.simpleFactoryPattern.shape.Shape;
import creationalDesignPattern.factory.simpleFactoryPattern.shape.impl.Circle;
import creationalDesignPattern.factory.simpleFactoryPattern.shape.impl.Rectangle;
import creationalDesignPattern.factory.simpleFactoryPattern.shape.impl.Square;

public class ShapeFactory {
    /**
     * doing 2 things ->
     * 1. selection of the objectType
     * 2. creation of the selected objectType
     * ==> violates SRP -> as does 2 things
     * ==> violates OCP -> as we need to update this siwtch case for new branches addition
     *
     * @param shapeType
     * @return
     */
    public static Shape createShapeInstance(ShapeType shapeType){
        if(shapeType == null) return null;

        return switch(shapeType){
            case CIRCLE ->    new Circle();
            case SQUARE ->    new Square();
            case RECTANGLE -> new Rectangle();
            default -> throw new IllegalArgumentException("ShapeType doesn't exist");
        };
    }
}
