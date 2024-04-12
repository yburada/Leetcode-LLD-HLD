package DesignPatterns.FactoryPattern;

import DesignPatterns.FactoryPattern.Factory.ShapeFactory;

public class MainClass {

    public static void main(String[] args) {

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
