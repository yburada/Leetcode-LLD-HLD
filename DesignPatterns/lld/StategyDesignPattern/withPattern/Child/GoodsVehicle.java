package DesignPatterns.lld.StategyDesignPattern.withPattern.Child;

import DesignPatterns.lld.StategyDesignPattern.withPattern.Parent.Vehicle;
import DesignPatterns.lld.StategyDesignPattern.withPattern.Parent.strategy.OnRoadDriveStrategy;

public class GoodsVehicle extends Vehicle {

    GoodsVehicle(){
        super(new OnRoadDriveStrategy());
    }
}
