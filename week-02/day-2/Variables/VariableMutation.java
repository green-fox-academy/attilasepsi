package com.greenfoxacademy.Variables;

import static java.lang.System.*;

public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        // Növeld meg az "a" változó értékét 10-zel

        out.println(a + 10);

        int b = 100;
        // Csökkentsd a "b" változó értékeét 7-tel

        out.println(b - 7);

        int c = 44;
        // A c értéke legyen dupla akkora

        out.println(c * 2);

        int d = 125;
        // Oszd el a d-t 5-tel
        out.println(d / 5);

        int e = 8;
        out.println(e *= e * e);
        // Emeld köbre az e változó értékét


        int f1 = 123;
        int f2 = 345;
        // Logikai (boolean) értékként írasd ki hogy f1 nagyobb-e f2-nél
        boolean isBigger = f1 > f2;
        System.out.println(isBigger);


        int g1 = 350;
        int g2 = 200;
        // Mondja meg a program, hogy g2 duplája nagyobb-e g1-nél (boolean)
        boolean isDoubleBigger = g2 * 2 > g1 * 2;
        System.out.println(isDoubleBigger);


        int h = 135798745;
        int i = h % 11;
        boolean dividable = h == 0;
        System.out.println(dividable);
        // Mondja meg a program, hogy osztható-e 11-el maradék nélkül?
        // Írasd is ki logikai (boolean) értékként


        int i1 = 10;
        int i2 = 3;
        boolean biggerAndSmaller = i1 > i2 * i2 && i1 < i2 * i2 * i2;
        System.out.println(biggerAndSmaller);
        // Mondja meg a program hogy i1 nagyobb-e i2 négyzeténél ÉS ugyanakkor kisebb-e i2 köbénél (boolean)

        int j = 1521;
        // Írasd ki, hogy j osztható-e 3-mal vagy 5-tel (boolean)
        boolean dividableWith = j%3==0 | j%5==0;
        System.out.println(dividableWith);
    }
}
