package com.company;

import java.util.Scanner;
        import java.util.Random;

public class NUMBER_GAME {

    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 100;
    private static final int MAX_ATTEMPTS = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;
        while (playAgain) {
            int secretNumber = random.nextInt(MAX_RANGE) + MIN_RANGE;
            int guessCount = 0;

            System.out.println("Welcome to the number guessing game!");
            System.out.println("Guess a number between " + MIN_RANGE + " and " + MAX_RANGE + ".");

            while (guessCount < MAX_ATTEMPTS) {
                int guess = scanner.nextInt();
                guessCount++;

                if (guess == secretNumber) {
                    System.out.println("Congratulations! You guessed the number in " + guessCount + " attempts.");
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Your guess is too low. Try again.");
                } else {
                    System.out.println("Your guess is too high. Try again.");
                }
            }

            if (guessCount == MAX_ATTEMPTS) {
                System.out.println("Sorry, you ran out of attempts. The secret number was " + secretNumber + ".");
            }

            System.out.println("Would you like to play again? (Enter 'yes' or 'no')");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        }

        scanner.close();
        System.out.println("Thank you for playing!");
    }
}