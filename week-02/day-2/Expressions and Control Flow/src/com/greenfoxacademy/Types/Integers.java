package com.greenfoxacademy.Types;

public class Integers {
    public static void main(String[] args) {
        // Pozitív, negatív és nulla (zero, not null)
        System.out.println(42); // Terminálban látható: 42
        System.out.println(-1); // Terminálban látható: -1
        System.out.println(0); // Terminálban látható: 0

        // Maximum és minimum érték
        // Egy egász szám 4 byte-ot foglal (32bit)

        // Maximum érték:  2 147 483 647
        System.out.println(2147483647);
        // Minimum érték: -2 147 483 648
        System.out.println(-2147483648);

        System.out.println(214483648); // Fordítási hiba (Compilation error)
    }
}
