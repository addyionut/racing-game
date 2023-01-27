package org.example;

import org.example.utils.ScannerUtils;

public class Game {
    public void start() {
        System.out.println("Welcome to the racing game!");
        int playerCount = getPlayerCountForUser();
        System.out.println("Player count: " + playerCount);
        String vehicleName = getVehicleNameFromUser();
        System.out.println("Vehicle name: " + vehicleName);
    }
    private int getPlayerCountForUser() {
        System.out.println("Please enter the number of players:");
        return ScannerUtils.nextIntAndNextLine();
    }

    private String getVehicleNameFromUser() {
        System.out.println("Please insert the vehicle name:");
        return ScannerUtils.nextLine();
    }
}
