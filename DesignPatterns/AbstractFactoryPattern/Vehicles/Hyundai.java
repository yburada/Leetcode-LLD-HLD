package DesignPatterns.AbstractFactoryPattern.Vehicles;

public class Hyundai implements EngineVehicle{
    @Override
    public String getName() {
        return "Hyundai";
    }

    @Override
    public String getColour() {
        return "White";
    }

    @Override
    public Boolean luxaryOrNot() {
        return false;
    }

    @Override
    public Double price() {
        return 23459.908;
    }
}
