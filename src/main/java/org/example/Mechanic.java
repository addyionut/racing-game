package org.example;

public class Mechanic {
    public void repair(Autovehicle autoVehicle) {
        autoVehicle.engine = new Engine();
        autoVehicle.damaged = false;
    }
}
