package com.greenfoxacademy.Functions;

public class Factorio {
    public static void main(String[] args) {
// - Hozz létre egy class-t `Factorio` névvel és benne a main függvényt.

// - Készíts egy függvényt `factorio` névvel,
//   mely visszaadja a bemeneti paraméter faktoriális értékét.

        System.out.println("A faktorális érték: " + factorio(5));
    }

    public static int factorio(int input) {
        int result = 1;
        for (int i = 1; i <= input; i++) {
            result *= i;
        }
        return result;
    }
}
