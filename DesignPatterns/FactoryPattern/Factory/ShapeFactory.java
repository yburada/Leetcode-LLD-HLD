package DesignPatterns.FactoryPattern.Factory;

import DesignPatterns.FactoryPattern.Circle;
import DesignPatterns.FactoryPattern.Cube;
import DesignPatterns.FactoryPattern.Rectangle;
import DesignPatterns.FactoryPattern.Shape;

public class ShapeFactory {

    public static Shape getShape(String name){
        switch (name){
            case "CIRCLE":
                return new Circle();
            case "CUBE":
                return new Cube();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }
    }
}
