package com.company;
import java.util.Scanner;

public class Piramide {

    /**
     * Stampa piramide di *
     *
     */

    public static void stampaPiramide() {
        Scanner piramide = new Scanner(System.in);
        System.out.println("Inserisci l'altezza della piramide: ");
        int altezza = piramide.nextInt();

        System.out.println();

        for(int i = 1; i <= altezza; i++) {

            for (int j = 1; j <= altezza-i; j++) {
                System.out.print(" ");

            }
            for (int ar = 1; ar <= (i * 2)-1; ar++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
