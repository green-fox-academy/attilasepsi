package com.greenfoxacademy.UserInput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Készít egy scanner-t
        Scanner scanner = new Scanner(System.in);

        // A program megáll és vár a felhasználói input-ra, illetve utána az enter megnyomására
        String userInput1 = scanner.nextLine();

        // Utána kiírja a felhasználó által beírt sor egészét
        System.out.println(userInput1);

        // A program megáll és vár a felhasználói input-ra (ami egy egész szám), illetve utána az enter megnyomására
        int userInput2 = scanner.nextInt();

        // Utána kiírja a felhasználó által beírt számot
        System.out.println(userInput2);
    }
}
