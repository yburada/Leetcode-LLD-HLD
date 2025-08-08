package DesignPatterns.lld.AbstractFactoryPattern.AbstractFactory;

import DesignPatterns.lld.AbstractFactoryPattern.Factories.Cars;
import DesignPatterns.lld.AbstractFactoryPattern.Factories.LuxaryCars;
import DesignPatterns.lld.AbstractFactoryPattern.Factories.NonLuxaryCars;

public class CarsFactory {
    public static Cars getTypeOfCars(String CarType){
        switch (CarType.toUpperCase()){
            case "LUXARY_CARS": return new LuxaryCars();
            case "NON_LUXARY_CARS": return new NonLuxaryCars();
            default: return null;
        }
    }
}
