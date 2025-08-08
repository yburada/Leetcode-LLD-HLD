package DesignPatterns.lld.StategyDesignPattern.withPattern.Parent.strategy;

public class OnRoadDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("On Road Driving...");
    }
}
