package com.greenfoxacademy.Strings;

public class TodoPrint {
    public static void main(String[] args) {
        String todoText = "- Buy milk\n";
        String firstRow = "My todo:\n";
        String thirdRow = "- Download games\n";
        String fourthRow = "\t- Diablo";



        // Add hozzá a "My todo:" szöveget a todoText szövege elejéhez.
        // Add hozzá a " - Download games" szöveget a todoText szöveg végéhez.
        // Add hozzá a " - Diablo" szöveget a todoText szöveg végéhez,
        // de behúzással.

        // Várt eredmény:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        System.out.print(firstRow + todoText + thirdRow + fourthRow);
    }
}
