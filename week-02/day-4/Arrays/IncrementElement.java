package com.greenfoxacademy.Arrays;

public class IncrementElement {
    public static void main(String[] args) {
        // - Készíts egy `numbers` nevű változót (tömböt)
        //   a következő tartalommal (értékekkel): `[1, 2, 3, 4, 5]`
        // - Növeld a harmadik elem értékét (pl.: eggyel)
        // - Írasd ki a konzolra a `numbers` nevű tömb harmadik elemét

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("A harmadik elem értéke: " + (numbers[2] += 1));

    }
}
