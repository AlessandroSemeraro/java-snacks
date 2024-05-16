package org.snacks;

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("inserisci una parola");
        String parola = scanner.nextLine();

        int simboli = 0;
        int lettere = 0;
        int numeri = 0;

        if (parola.charAt(0) != 0){
            for (int i = 0; i < parola.length(); i++){
                if (Character.isLetter(parola.charAt(i))) {
                    lettere++;
                } else if (Character.isDigit(parola.charAt(i))) {
                    numeri++;
                } else  {
                simboli++;
                }
            }
        }

        System.out.println("Ci sono: " + lettere  + " lettere");
        System.out.println("Ci sono: " + numeri  + " numeri");
        System.out.println("Ci sono: " + simboli  + " simboli");
        scanner.close();
    }
}
