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

        int codingHours = 6;
        int workDays = 5;
        int weeksPerHalfYear = 17;
        int daysNumberOfWeek = 7;
        int hoursOfDay = 24;
        int codingTime = (codingHours * workDays * weeksPerHalfYear);
        System.out.println("Egy átlagos Green Fox hallgató " + codingTime + " órát kódol egy fél év alatt.");

        int totalHoursOfHalfYear = (daysNumberOfWeek * hoursOfDay * weeksPerHalfYear);
        int totalWorkingHours = (52 * 17);
        double percentage = ((double) totalWorkingHours / (double) totalHoursOfHalfYear) * 100;
        System.out.printf("A félév " + ("%.2f"), percentage);
        System.out.print("%");
        System.out.print(" -át tölti a hallgató kódolással.");

    }
}
