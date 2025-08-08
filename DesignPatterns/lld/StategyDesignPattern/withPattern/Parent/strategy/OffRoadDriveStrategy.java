package DesignPatterns.lld.StategyDesignPattern.withPattern.Parent.strategy;

public class OffRoadDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Off Road Driving...");
    }
}
