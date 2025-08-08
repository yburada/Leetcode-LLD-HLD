package DesignPatterns.lld.AbstractFactoryPattern.Factories;

import DesignPatterns.lld.AbstractFactoryPattern.Vehicles.EngineVehicle;

public interface Cars {
    public EngineVehicle getVehicle(String carName);

}
