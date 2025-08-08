package DesignPatterns.lld.StategyDesignPattern.withPattern.Child;

import DesignPatterns.lld.StategyDesignPattern.withPattern.Parent.Vehicle;
import DesignPatterns.lld.StategyDesignPattern.withPattern.Parent.strategy.OffRoadDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle(){
        super(new OffRoadDriveStrategy());
    }
}
