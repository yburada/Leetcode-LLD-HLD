package DesignPatterns.lld.StategyDesignPattern.withPattern.Child;

import DesignPatterns.lld.StategyDesignPattern.withPattern.Parent.Vehicle;
import DesignPatterns.lld.StategyDesignPattern.withPattern.Parent.strategy.OffRoadDriveStrategy;

public class SportsVehicle extends Vehicle {

    SportsVehicle() {
        super(new OffRoadDriveStrategy());
    }
}
