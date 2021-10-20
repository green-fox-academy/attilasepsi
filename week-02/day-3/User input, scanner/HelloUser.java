package com.greenfoxacademy.UserInput;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Módosítsd úgy ezt a programot, hogy a felhasználót üdvözölje
        // a Világ helyett.
        // A program kérje a felhasználó nevét
        System.out.println("Kérem adja meg a nevét!");
        Scanner scanner = new Scanner(System.in);
        String userInput1 = scanner.nextLine();
        System.out.println("Hello " + userInput1 + "!");
    }
}
