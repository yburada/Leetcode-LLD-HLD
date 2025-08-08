package DesignPatterns.lld.StategyDesignPattern.withPattern.Child;

import DesignPatterns.lld.StategyDesignPattern.withPattern.Parent.Vehicle;
import DesignPatterns.lld.StategyDesignPattern.withPattern.Parent.strategy.OnRoadDriveStrategy;

public class RTCVehicle extends Vehicle {

    RTCVehicle(){
        super(new OnRoadDriveStrategy());
    }
}
