package DesignPatterns.lld.StategyDesignPattern.withOutPattern.Child;

import DesignPatterns.lld.StategyDesignPattern.withOutPattern.Parent.Vehicle;

public class SportsVehicle extends Vehicle {

    @Override
    public void drive() {
        System.out.println("Off Road Driving...");
    }
}
