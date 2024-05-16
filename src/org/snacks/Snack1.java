package org.snacks;

import java.util.Scanner;

//Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
public class Snack1 {
    public static void main(String[] args) {
        //open scanner
        Scanner scanner = new Scanner(System.in);

        double num;
        System.out.print("Inserisci il numero: ");
        num = Integer.parseInt(scanner.nextLine());

        if ( num % 2 == 0){
            System.out.println("il numero" + (int)num + "è pari");
        } else {
            System.out.println("il numero " + num + " è dispari" + " e il numero successivo è: " + ((int)num + 1) );
        }
        //close scanner
        scanner.close();
    }
}
