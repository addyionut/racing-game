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

        Car car2 = new Car();
        car2.name = "Renault";
        car2.fuelLevel = 70;
        car2.totalTraveledDistance = 30;

        car2.engine = new Engine();
        car2.engine.capacity = 2_000;

        Engine engine1 = new Engine();
        engine1.capacity = 3_000;
        engine1.manufacturer = "Ferrari";

        carReference.engine = engine1;

        double distanceCar1 = carReference.accelerate(60, 1);
        double distanceCar2 = car2.accelerate(100, 1);
        if (distanceCar1 > distanceCar2) {
            System.out.println("Longest distance " + carReference.name);
        }   else {
            System.out.println("Longest distance: " + carReference.name);
        }
        System.out.println("Engine capacity " + engine1.capacity);
        System.out.println("Car engine capacity " + carReference.engine.capacity);

        engine1.capacity = 4000;

        System.out.println("Car engine capacity after update " + carReference.engine.capacity);
        carReference.price = 1_000_000_000;
        System.out.println("Car is cost: " + carReference.price);
    }
}
