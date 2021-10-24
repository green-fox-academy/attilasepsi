package com.greenfoxacademy.Conditionals;

import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Írj egy programot, ami két számot kér a standard input-ból
        // és kiírja a nagyobbat


        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg 1 számot!");
        int num1 = (int) scanner.nextDouble();
        System.out.println("Kérlek adj meg mégegyet!");
        int num2 = (int) scanner.nextDouble();

        if (num1 > num2) {
            System.out.println("A nagyobb szám: " + num1);
        } else {
            System.out.println("A nagyobb szám: " + num2);

        }
    }
}
