package DesignPatterns.lld.AbstractFactoryPattern.Factories;

import DesignPatterns.lld.AbstractFactoryPattern.Vehicles.EngineVehicle;
import DesignPatterns.lld.AbstractFactoryPattern.Vehicles.Hyundai;
import DesignPatterns.lld.AbstractFactoryPattern.Vehicles.Swift;

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
