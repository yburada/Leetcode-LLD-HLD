package DesignPatterns.AbstractFactoryPattern.AbstractFactory;

import DesignPatterns.AbstractFactoryPattern.Factories.Cars;
import DesignPatterns.AbstractFactoryPattern.Factories.LuxaryCars;
import DesignPatterns.AbstractFactoryPattern.Factories.NonLuxaryCars;
import DesignPatterns.AbstractFactoryPattern.Vehicles.EngineVehicle;

public class CarsFactory {
    public static Cars getTypeOfCars(String CarType){
        switch (CarType.toUpperCase()){
            case "LUXARY_CARS": return new LuxaryCars();
            case "NON_LUXARY_CARS": return new NonLuxaryCars();
            default: return null;
        }
    }
}
