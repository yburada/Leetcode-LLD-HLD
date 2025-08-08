package DesignPatterns.lld.StategyDesignPattern.withOutPattern.Parent;

public class Vehicle {
    /*
    @Vehicle is Parent class
    have 4 child classes
    @GoodsVehicle, @OffRoadVehicle, @RTCVehicle, @SportsVehicle
    If we clearly observe GoodsVehicle and RTCVehicle have same drive code and OffRoadVehicle, SportsVehicle same drive code.
    So there is a chance of code duplicate to eradicate this we use Strategy Pattern
     */
    public void drive(){
        System.out.println("Driving on duty...");
    }
}
