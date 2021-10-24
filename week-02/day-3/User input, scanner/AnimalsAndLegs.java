package com.greenfoxacademy.UserInput;

import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {

        // Írj egy programot, ami két egész számot kér
        // Az első a farmer tyúkjainak számát reprezentálja
        // A második a farmer sertéseinek számát reprezentálja
        // Írja ki, hogy összesen hány darab lába van az állatoknak a farmon

        Scanner scanner = new Scanner(System.in);


        System.out.println("Hány tyúkja van a farmernek?");
        double number1 = (int) scanner.nextDouble();

        System.out.println("Hány sertése van a farmernek?");
        double number2 = (int) scanner.nextDouble();

        int legsOfChiken = (int) number1 * 2;
        int legsOfPig = (int) number2 *4;

        System.out.println("Összesen: " + (legsOfChiken + legsOfPig) + " lábuk van az állatoknak.");




    }
}
