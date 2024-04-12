package DesignPatterns.AbstractFactoryPattern.Factories;

import DesignPatterns.AbstractFactoryPattern.Vehicles.EngineVehicle;

public interface Cars {
    public EngineVehicle getVehicle(String carName);

}
