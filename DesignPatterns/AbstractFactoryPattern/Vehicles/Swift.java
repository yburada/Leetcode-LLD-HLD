package DesignPatterns.AbstractFactoryPattern.Vehicles;

public class Swift implements EngineVehicle{
    @Override
    public String getName() {
        return "Swift";
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
