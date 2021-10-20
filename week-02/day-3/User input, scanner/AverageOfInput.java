package com.greenfoxacademy.UserInput;

import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Írj egy programot, ami 5 egész számot kér be egymás után,
        // majd kiírja a számok összegét és átlagát a következő formátumban:
        //
        // Összeg: 22, Átlag: 4.4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg 1 egész számot!");
        int number1 = (int) scanner.nextDouble();
        System.out.println("Adj meg mégegyet!");
        int number2 = (int) scanner.nextDouble();
        System.out.println("Na mégegyet!");
        int number3 = (int) scanner.nextDouble();
        System.out.println("Egy utolsó előttire van szükségem!");
        int number4 = (int) scanner.nextDouble();
        System.out.println("És végül egy utolsót számot kérek!");
        int number5 = (int) scanner.nextDouble();
        int amountOfNumbers;
        amountOfNumbers = (number1 + number2 + number3 + number4 + number5);

        double averageOfNumbers;
        averageOfNumbers = (number1 + number2 + number3 + number4 + number5) / 5;
        System.out.println("Összeg: " + amountOfNumbers);
        System.out.println("Átlag: " + averageOfNumbers);
    }
}
