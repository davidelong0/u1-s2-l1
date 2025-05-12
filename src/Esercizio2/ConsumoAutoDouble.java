package Esercizio2;
import java.util.Scanner;

public class ConsumoAutoDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Inserisci i km percorsi: ");
            double km = scanner.nextDouble();

            System.out.print("Inserisci i litri consumati: ");
            double litri = scanner.nextDouble();

            if (litri == 0) {
                throw new ArithmeticException("Divisione per zero");
            }

            double kmPerLitro = km / litri;
            System.out.println("Hai percorso " + kmPerLitro + " km/litro.");
        } catch (ArithmeticException e) {
            System.out.println("Errore: non puoi dividere per zero! Hai inserito 0 litri.");
        } catch (Exception e) {
            System.out.println("Errore generico: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

