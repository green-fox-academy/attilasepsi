package com.greenfoxacademy.Strings;

public class UrlFixer {
    public static void main(String[] args) {

        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Véletlenül rossz URL-t kaptam egy vicces subreddithez.
        // Valószínűleg ez "odds" és nem "bots" akart lenni.
        // Továbbá az URL-ből hiányzik egy fontos rész, derítsd ki
        // melyik az és illeszd be.
        // Próbáld meg megoldani többféleképpen különböző String függvényekkel.

        String replace = url.replace("bots", "odds");
        System.out.println(replace + "/");
    }
}
