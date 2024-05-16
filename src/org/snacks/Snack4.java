package org.snacks;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        boolean palindromo = true;

        System.out.println("Inserisci una parola:");
        String parola = scanner.nextLine();

        int j = parola.length()-1;
        for (int i = 0; i < parola.length(); i++ , j-- ){
            if (parola.charAt(i) != parola.charAt(j)){
                palindromo = false;
            }
        }

        if (palindromo) {
            System.out.println("La parola è palindroma");
        } else {
            System.out.println("La parola non è palindroma");
        }

        scanner.close();
    }
}
