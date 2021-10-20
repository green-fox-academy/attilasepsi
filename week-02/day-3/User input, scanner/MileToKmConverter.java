package com.greenfoxacademy.UserInput;

import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Írj egy olyan programot, ami egy számot (használj double-t) kér
        // felhasználói inputként és az a szám a távolságot jelenti mérföldben,
        // majd ezt átszámítja és kiírja a távolságot kilométerben
        Scanner scanner = new Scanner(System.in);
        double oneMilePerKm = 1.609344;
        System.out.println("Add meg a távolságot!");
        double mile = scanner.nextDouble();
        System.out.println("A távolság: " + mile * oneMilePerKm + " km");
    }
}
