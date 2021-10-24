package com.greenfoxacademy.Arrays;

public class SumAll {
    public static void main(String[] args) {

        // - Készíts egy `numbers` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `[3, 4, 5, 6, 7]`
// - Írasd ki a konzolra a `numbers` tömb összes elemének összegét


        int[] numbers = {3, 4, 5, 6, 7};

        int sum = 0;
        for (int i = 0; 5 > i; i++) {
            sum += numbers[i];
            System.out.println(sum);
        }
    }
}
