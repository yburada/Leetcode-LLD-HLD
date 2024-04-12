package DesignPatterns.AbstractFactoryPattern.Factories;

import DesignPatterns.AbstractFactoryPattern.Vehicles.EngineVehicle;
import DesignPatterns.AbstractFactoryPattern.Vehicles.Hyundai;
import DesignPatterns.AbstractFactoryPattern.Vehicles.Swift;

public class NonLuxaryCars implements Cars {

    @Override
    public EngineVehicle getVehicle(String carName){
        switch (carName){
            case "SWIFT": return new Swift();
            case "HYUNDAI": return new Hyundai();
            default: return null;
        }
    }
}
