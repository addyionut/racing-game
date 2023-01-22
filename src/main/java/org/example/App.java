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

        Engine engine1 = new Engine();
        engine1.capacity = 3000;
        engine1.manufacturer = "Ferrari";

        carReference.engine = engine1;

        System.out.println("Engine capacity " + engine1.capacity);
        System.out.println("Car engine capacity " + carReference.engine.capacity);

        engine1.capacity = 4000;
        System.out.println("Car engine capacity after update " + carReference.engine.capacity);

    }
}
