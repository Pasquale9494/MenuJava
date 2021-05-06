package com.company;

public class Matrice {

    static int i, j;
    static int[][] array = new int[3][4];

    /**
     * Stampa matrice con valori disposti verticalmente
     *
     */

    public static void stampaVerticale() {
        System.out.println("\nSTAMPA VERTICALE\n");
        for(i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                array[i][j] = (j+1) * (i+1);
                System.out.println("[" + (i+1) + "][" + (j+1) + "] ==> " + array[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Stampa matrice con valori disposti a griglia
     *
     */

    public static void stampaOrizzontale() {
        System.out.println("\nSTAMPA ORIZZONTALE\n");
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                array[i][j] = (j+1) * (i+1);
                System.out.print("[" + array[i][j] + "]");
            }
            System.out.println();
        }
    }
}

