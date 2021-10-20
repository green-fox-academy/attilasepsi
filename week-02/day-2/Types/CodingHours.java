package com.greenfoxacademy.Types;

public class CodingHours {
    public static void main(String[] args) {
        // Egy átlagos Green Fox hallgató 6 órát kódol naponta
// Egy félév hosszúsága 17 hét
//
// Írd ki, hány órát tölt kódolással egy hallgató egy félév során,
// ha a hallgató csak hétköznap kódol
//
// Írd ki, hogy a félév hány százalékát tölti a hallgató kódolással
// ha az átlagos heti munkaidő 52 óra

        int Hours = 6;
        int Days = 5;
        int Weeks = 17;
        int WeeklyHours = 52;
        int CodingTime = (Hours * Days * Weeks);

        System.out.println ("Egy átlagos Green Fox hallgató " + CodingTime + " órát kódol egy fél év alatt." );
    }
}
