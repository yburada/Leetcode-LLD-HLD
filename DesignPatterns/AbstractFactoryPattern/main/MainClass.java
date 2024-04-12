package DesignPatterns.AbstractFactoryPattern.main;

import DesignPatterns.AbstractFactoryPattern.AbstractFactory.CarsFactory;
import DesignPatterns.AbstractFactoryPattern.Factories.Cars;
import DesignPatterns.AbstractFactoryPattern.Vehicles.EngineVehicle;

public class MainClass {

    private static String carName;

    public static void main(String[] args) {
        carName =CarsFactory.getTypeOfCars("LUXARY_CARS").getVehicle("BMW").getName();
        System.out.println("Car Name : " +carName);

        carName =CarsFactory.getTypeOfCars("LUXARY_CARS").getVehicle("POSH").getName();
        System.out.println("Car Name : " +carName);

        carName =CarsFactory.getTypeOfCars("NON_LUXARY_CARS").getVehicle("SWIFT").getName();
        System.out.println("Car Name : " +carName);

        carName =CarsFactory.getTypeOfCars("NON_LUXARY_CARS").getVehicle("HYUNDAI").getName();
        System.out.println("Car Name : " +carName);


    }
}
