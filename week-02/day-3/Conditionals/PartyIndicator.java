import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        // Írj egy programot, ami két számot kér a standard input-ból
        // Az első szám a lányok száma, akik jönnek a buliba
        // A második szám a fiúk száma
        //
        // Ha több, mint 20 ember eljön és a lányok és fiúk száma egyenlő
        // Írja ki, hogy: Ez a buli kitűnő!
        //
        // Ha több, mint 20 ember eljön, de a lányok - fiúk arány nem egyenlő
        // Írja ki, hogy: Ez a buli egész jó!
        //
        // Ha kevesebb, mint 20 ember jön el
        // Írja ki, hogy: Átlagos buli...
        //
        // Ha egy lány sem jön el, függetlenül az emberek számától
        // Írja ki, hogy: Virsli party

        Scanner scanner = new Scanner(System.in);
        System.out.print("Írd be, a buliba érkező lányok számát: ");
        int numberOfGirls = scanner.nextInt();
        System.out.print("Írd be, a buliba érkező fiúk számát: ");
        int numberOfBoys = scanner.nextInt();

        if (numberOfGirls == 0) {
            System.out.println("Virsli party!");
        } else if (numberOfGirls + numberOfBoys > 20 && numberOfBoys == numberOfGirls) {
            System.out.println("Ez a buli kitűnő!");
        } else if (numberOfGirls + numberOfBoys > 20 && numberOfBoys != numberOfGirls) {
            System.out.println("Ez a buli egész jó!");
        } else if (numberOfGirls + numberOfBoys <= 20) {
            System.out.println("Átlagos buli...");
        }
    }
}


