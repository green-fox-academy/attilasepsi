package com.greenfoxacademy.Conditionals;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Írj egy programot ami beolvas egy számot a standard input-ból (scanner),
        // majd kiírja, hogy "Páros", ha páros és
        // kiírja, hogy "Páratlan", ha páratlan.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg 1 számot!");
        int userNumber = scanner.nextInt();
        if (userNumber % 2 == 0) {
            System.out.println("Páros");
        } else {
            System.out.println("Páratlan");
        }
    }
}

