package Hangman;

import java.util.Scanner;

public class hangmanLogic {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String secretWord = "";
        String guess = "";
        int guessCount = 0;
        int guessLimit = 3;
        boolean outOfGuesses = false;

        // ASK THE HOSTUSER FOR A WORD TO GUESS
        // --------------------------------------------------------------------------------
        System.out.println("Please enter the secret word: ");
        secretWord = scnr.nextLine();

        // PUT HOSTUSERS WORD INTO AN ARRAY
        // --------------------------------------------------------------------------------
        char[] characterArray = secretWord.toCharArray();
        System.out.println("your secret word in an array: " + "" + new String(characterArray));

        // HIDE THE HOSTUSERS WORD UNTIL GUESSED CORRECTLY
        // --------------------------------------------------------------------------------
        String hiddenSecretWord = secretWord;
        hiddenSecretWord = secretWord.replaceAll(".", "_");
        System.out.println(hiddenSecretWord);

        while (!guess.equals(secretWord) && !outOfGuesses) {

            if (guessCount < guessLimit) {
                System.out.print("Enter a guess: ");
                guess = scnr.nextLine();
                guessCount++;
            } else {
                outOfGuesses = true;
            }
        }

        if (outOfGuesses) {
            System.out.println("You Lose! Correct word is: " + secretWord);
        } else {
            System.out.println("You Win!");
        }
        scnr.close();
    }
}