package DesignPatterns.lld.FactoryPattern;

import DesignPatterns.lld.FactoryPattern.Factory.ShapeFactory;

public class MainClass {

    public static void main(String[] args) {

        /*
        Factory Design Pattern. usage of Single Interface.
        1. Created the Interface of shape which contains draw method.
        2. Using this Interface created different shapes CIRCLE, RECTANGLE, CUBE.
        3. Created a factory which can generate any shape.
         */

        Shape sh = ShapeFactory.getShape("RECTANGLE");
        System.out.println(sh.draw());
        sh = ShapeFactory.getShape("CIRCLE");
        System.out.println(sh.draw());
        sh = ShapeFactory.getShape("CUBE");
        System.out.println(sh.draw());

        /*
        output:
                Rectangle
                Circle
                Cube
         */

    }
}
