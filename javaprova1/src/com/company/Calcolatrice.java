package com.company;

public class Calcolatrice {

    /**
     * Esegue addizione
     *
     */

    public static int addizione(int a, int b, int somma) {

        somma=a+b;
        return somma;
    }

    /**
     * Esegue sottrazione
     *
     */

    public static int sottrazione(int a, int b, int differenza) {

        differenza = a-b;
        return differenza;
    }

    /**
     * Esegue moltiplicazione
     *
     */

    public static int moltiplicazione(int a, int b, int prodotto) {

        prodotto = a+b;
        return prodotto;
    }

    /**
     * Esegue divisione
     *
     */

    public static float divisione(int a, int b, float quoziente) {

        quoziente = a/b;
        return quoziente;
    }
}
