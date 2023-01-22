package org.example;

public class App
{
    public static void main( String[] args )
    {
        Car carReference = new Car();
        carReference.name = "Ferrari";
        carReference.fuelLevel = 60;
        carReference.maxSpeed = 300;
        carReference.mileage = 12;
        carReference.totalTraveledDistance = 0;
        carReference.damaged = true;
        carReference.doorCount = 4;
        carReference.color = "white";
        System.out.println("Properties of car " + carReference.name);
    }
}
