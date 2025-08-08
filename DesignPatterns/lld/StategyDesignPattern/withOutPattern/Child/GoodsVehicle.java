package DesignPatterns.lld.StategyDesignPattern.withOutPattern.Child;

import DesignPatterns.lld.StategyDesignPattern.withOutPattern.Parent.Vehicle;

public class GoodsVehicle extends Vehicle {

    @Override
    public void drive() {
        System.out.println("On Road Driving...");
    }
}
