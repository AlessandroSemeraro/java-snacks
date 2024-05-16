package org.snacks;

//Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari

public class Snack3 {
    public static void main(String[] args) {
        //creo array numeri
        int[] numeri = {1,2,3,4,5,6,7,8};

        //parametrizzo somma
        int somma = 0;

        //ciclo array e incremento la variabile i di 2
        for (int i = 0; i < numeri.length; i += 2) {

            //sommo gli elementi
            somma += numeri[i];

        }

        System.out.println("La somma degli elementi in posizione dispari è: " + somma);

    }

}
