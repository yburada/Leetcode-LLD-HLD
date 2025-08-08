package DesignPatterns.lld.AbstractFactoryPattern.Factories;

import DesignPatterns.lld.AbstractFactoryPattern.Vehicles.*;

public class LuxaryCars implements Cars {
    @Override
    public EngineVehicle getVehicle(String carName){
        switch (carName.toUpperCase()){
            case "BMW": return new BMW();
            case "POSH": return new Posh();
            default: return null;
        }
    }
}
