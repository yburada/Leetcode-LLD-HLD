package DesignPatterns.lld.FactoryPattern.Factory;

import DesignPatterns.lld.FactoryPattern.Circle;
import DesignPatterns.lld.FactoryPattern.Cube;
import DesignPatterns.lld.FactoryPattern.Rectangle;
import DesignPatterns.lld.FactoryPattern.Shape;

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
