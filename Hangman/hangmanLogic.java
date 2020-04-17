package Hangman;

import java.util.Scanner;

public class hangmanLogic {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        // Ask the user for a character
        System.out.print("Enter an alphebetic character: ");
        char character = scnr.next().charAt(0);

        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {

            System.out.println("Thanks! [" + character + "] is valid.");
        } else {
            System.out.println("Sorry [" + character + "] is not valid.");
        }
        scnr.close();
    }
}