package org.example;

public class Car {
    String name;
    double fuelLevel;
    double mileage;
    double totalTraveledDistance;
    double maxSpeed;
    boolean damaged;
    int doorCount;
    String color;

    //has-a relationship (aggregation)
    Engine engine;
}
