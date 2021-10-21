package com.greenfoxacademy.Arrays;

public class DoubleItems {
    public static void main(String[] args) {

        // - Készíts egy `numList` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `[3, 4, 5, 6, 7]`
// - Duplázd meg minden elem értéket a tömbben

        int[] numbers = {3, 4, 5, 6, 7};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]*2 + " ");
        }
    }
}
