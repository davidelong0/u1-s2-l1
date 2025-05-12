package Esercizio1;

import java.util.Random;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        int[] numeri = new int[5];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = random.nextInt(10) + 1; // +1 perché nextInt(10) genera 0-9
        }


        System.out.println("Array iniziale:");
        stampaArray(numeri);

        while (true) {
            try {

                System.out.print("Inserisci la posizione da modificare (0-4): ");
                int posizione = scanner.nextInt();


                if (posizione < 0 || posizione >= numeri.length) {
                    System.out.println("Posizione non valida. Deve essere tra 0 e 4.");
                    continue;
                }


                System.out.print("Inserisci il nuovo valore (0 per uscire): ");
                int valore = scanner.nextInt();


                if (valore == 0) {
                    System.out.println("Programma terminato.");
                    break;
                }


                numeri[posizione] = valore;


                System.out.println("Array aggiornato:");
                stampaArray(numeri);

            } catch (Exception e) {
                System.out.println("Errore di input. Assicurati di inserire numeri interi.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }


    public static void stampaArray(int[] array) {
        for (int n : array) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
