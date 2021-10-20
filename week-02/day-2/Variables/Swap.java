package com.greenfoxacademy.Variables;

public class Swap {
    public static void main(String[] args) {
        // Cseréld meg a 2 változó értékét programozás útján.
        // Az a értéke legyen az, ami a b változóban van és fordítva.

        int swap;
        int a = 123;
        int b = 526;

        swap = a;
        a = b;
        b = swap;
        System.out.println("a = " + a + " és b = " + b);

    }
}
