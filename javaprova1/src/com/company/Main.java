package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner nl=new Scanner(System.in);

        int scelta;
        do {
            System.out.println("\tMENU\n");
            System.out.println("1) Stampa Matrice (> or ^)");
            System.out.println("2) Stampa Piramide");
            System.out.println("3) Calcolatrice");
            System.out.println("0) Esci\n");
            System.out.print("\tScegli: ");
            scelta = sc.nextInt();

            switch (scelta) {

                case 1:
                    int caso;

                    do {
                        System.out.println("\n\n\t[1] STAMPA MATRICE\n");
                        System.out.println("1. Stampa Verticale");
                        System.out.println("2. Stampa Orizzontale");
                        System.out.println("0. Esci\n");
                        System.out.print("\tScegli: ");
                        caso = sc.nextInt();

                        switch (caso) {
                            case 1:
                                Matrice.stampaVerticale();
                                break;

                            case 2:
                                Matrice.stampaOrizzontale();
                                break;

                            case 0:
                                System.out.println("\n\nTorno al menu");
                                break;

                            default:
                                System.out.println("\nRiprova\n");
                                break;
                        }
                    } while (caso!=0);

                    System.out.println("Premi invio per continuare. \n");
                    nl.nextLine();
                    break;

                case 2:
                    System.out.println("\n\n\t[2] STAMPA PIRAMIDE\n");
                    Piramide.stampaPiramide();

                    System.out.println("\nPremi invio per continuare. \n");
                    nl.nextLine();
                    break;

                case 3:
                    int sceltaop, a, b;
                    do {
                        System.out.println("\n\n\t[3] CALCOLATRICE\n");
                        System.out.println("Inserisci i due numeri su cui operare: ");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println("1. Esegui Addizione");
                        System.out.println("2. Esegui Sottrazione");
                        System.out.println("3. Esegui Moltiplicazione");
                        System.out.println("4. Esegui Divisione");
                        System.out.println("0. Esci\n");
                        System.out.print("\tScegli: ");
                        sceltaop = sc.nextInt();

                        switch (sceltaop) {
                            case 1:
                                /*Calcolatrice.addizione(a, b, somma);
                                System.out.println("Il risultato e': " + somma);*/
                                break;

                            case 2:
                               /* Calcolatrice.sottrazione(a, b, differenza);
                                System.out.println("Il risultato e': " + differenza); */
                                break;

                            case 3:
                               /* Calcolatrice.moltiplicazione(a, b, prodotto);
                                System.out.println("Il risultato e': " + prodotto);*/
                                break;

                            case 4:
                               /* Calcolatrice.divisione(a, b, quoziente);
                                System.out.println("Il risultato e': " + quoziente); */
                                break;

                            case 0:
                                System.out.println("\n\nTorno al menu");
                                break;

                            default:
                                System.out.println("\nRiprova\n");
                                break;
                        }
                    } while (sceltaop!=0);

                    System.out.println("\nPremi invio per continuare. \n");
                    nl.nextLine();
                    break;

                case 0:
                    System.out.println("\n\nUscita");

                    System.out.println("\nPremi invio per continuare. \n");
                    nl.nextLine();
                    break;

                default:
                    System.out.println("\nSCELTA ERRATA. Riprovare\n");

                    System.out.println("\nPremi invio per continuare. \n");
                    nl.nextLine();
                    break;

            }
        }   while (scelta != 0);

    }
}
