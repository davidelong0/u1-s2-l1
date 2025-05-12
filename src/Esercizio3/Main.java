package Esercizio3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContoCorrente cc = new ContoCorrente("Mario Rossi", 100);
        ContoOnLine co = new ContoOnLine("Luigi Verdi", 200, 50);

        System.out.println("=== Prelievi da ContoCorrente ===");
        while (true) {
            System.out.print("Inserisci importo da prelevare (0 per uscire): ");
            double importo = scanner.nextDouble();
            if (importo == 0) break;
            try {
                cc.preleva(importo);
                System.out.println("Saldo attuale: " + cc.restituisciSaldo());
            } catch (BancaException e) {
                System.out.println("Errore: " + e.getMessage());
            }
        }

        System.out.println("\n=== Prelievi da ContoOnLine ===");
        while (true) {
            System.out.print("Inserisci importo da prelevare (0 per uscire): ");
            double importo = scanner.nextDouble();
            if (importo == 0) break;
            try {
                co.preleva(importo);
                co.stampaSaldo();
            } catch (BancaException e) {
                System.out.println("Errore: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
