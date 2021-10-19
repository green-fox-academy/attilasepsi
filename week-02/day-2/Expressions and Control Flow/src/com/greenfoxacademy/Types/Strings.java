package com.greenfoxacademy.Types;

public class Strings {
    public static void main(String[] args) {
        // Stringek és speciális karakterek
        System.out.println("apple"); // Terminálban látható: apple
        System.out.println("don't"); // Terminálban látható: don't
        System.out.println("\"Everything you can imagine is real.\" - Picasso");
        // Védő karakter (escape) a \ jel. Ha macskakörmök között szeretnénk macskakörmöt használni.
        // Terminálban látható: "Everything you can imagine is real." - Picasso

        // Karakterlánc műveletek
        // Összefűzés
        System.out.println("tooth" + "brush"); // Terminálban látható: toothbrush

        // Karakterláncok összefűzése számmal
        System.out.println("My favorite number is: " + 8);
        // Terminálban látható: My favorite number is: 8
    }
}
