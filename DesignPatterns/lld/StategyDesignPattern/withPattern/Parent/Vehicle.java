package DesignPatterns.lld.StategyDesignPattern.withPattern.Parent;

import DesignPatterns.lld.StategyDesignPattern.withPattern.Parent.strategy.DriveStrategy;
/*
Here we have used a @DriveStrategy and which have On and Off road strategy drive methods
So the child classes of Vehicle can re-use it without duplicating
 */
public class Vehicle {

    private DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
