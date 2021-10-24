package com.greenfoxacademy.Functions;

import static java.lang.System.*;

public class Sum {
    public static void main(String[] args) {

        System.out.println(sum(10));
    }

    public static int sum(int sumOfTheNumbers) {
        int sum = 0;
        for (int i = sumOfTheNumbers; i > 0; i--)
            sum += i;
        return sum;
    }
}
