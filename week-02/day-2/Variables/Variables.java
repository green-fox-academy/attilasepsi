package com.greenfoxacademy.Variables;

    public class Variables {
        public static void main(String[] args) {
            int a = 12;
            a += 4;
            System.out.println(a); // Terminálban látható: 16

            int b = 12;
            b -= 4;
            System.out.println(b); // Terminálban látható: 8

            int c = 12;
            System.out.println(c++); // Terminálban látható: 12
            System.out.println(c); // Terminálban látható: 13

            int d = 12;
            System.out.println(++d); // Terminálban látható: 13
            System.out.println(d); // Terminálban látható: 13

            int e = 12;
            System.out.println(e--); // Terminálban látható: 12
            System.out.println(e); // Terminálban látható: 11

            int f = 12;
            System.out.println(--f); // Terminálban látható: 11
            System.out.println(f); // Terminálban látható: 11

            int g = 12;
            g *= 3;
            System.out.println(g); // Terminálban látható: 36

            int h = 12;
            h /= 3;
            System.out.println(h); // Terminálban látható: 4

            int i = 12;
            i %= 7;
            System.out.println(i); // Terminálban látható: 5
        }
}
