package DesignPatterns.AbstractFactoryPattern.main;

import DesignPatterns.AbstractFactoryPattern.AbstractFactory.CarsFactory;

public class MainClass {

    /*
    Abstract Factory Design Pattern. It is creating factory of Factories
    1. Created classes for cars under Engine Vehicles(I)
    2. for those Vehicle segregated into two Varient Luxary and Non-Luxary Cars under Cars(I) created two factories
    3. for those Factories Created another CarsFactory this is abstract design pattern.
     */

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
