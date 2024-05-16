package org.snacks;

import java.util.Random;

//Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi, e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
public class Snack2 {
    public static void main(String[] args) {

        //creo array nomi e cognomi
        String[] nomi = {"Luca", "Giovanni", "Alberto", "Donato", "Umberto", "Lucia", "Carlo"};
        String[] cognomi = {"Delenti", "Pirro", "Fiume", "Bianchi", "Rossi", "Sensi", "Parico"};

        for (int i = 0; i < 10; i++) {

            int randomNomi = new Random().nextInt(nomi.length);

            int randomCognomi = new Random().nextInt(cognomi.length);

            System.out.println(nomi[randomNomi] + " " + cognomi[randomCognomi]);

        }
    }
}
