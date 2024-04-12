package DesignPatterns.AbstractFactoryPattern.Vehicles;

public class BMW  implements EngineVehicle {
    @Override
    public String getName() {
        return "BMW";
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
