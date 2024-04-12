package DesignPatterns.AbstractFactoryPattern.Vehicles;

public class Posh implements EngineVehicle {
    @Override
    public String getName() {
        return "Posh";
    }

    @Override
    public String getColour() {
        return "Black";
    }

    @Override
    public Boolean luxaryOrNot() {
        return true;
    }

    @Override
    public Double price() {
        return 12356789.98777;
    }
}
