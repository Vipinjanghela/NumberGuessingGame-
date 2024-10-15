import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int maxAttempts = 5;  // Limiting the number of attempts
            int score = 0;        // Initial score

            System.out.println("Welcome to the Number Guessing Game!");
            boolean playAgain = true;

            while (playAgain) {
                int numberToGuess = random.nextInt(100) + 1;  // Random number between 1 and 100
                int numberOfAttempts = 0;
                boolean hasWon = false;

                System.out.println("I have chosen a number between 1 and 100. Can you guess it?");

                // Loop for guessing attempts
                while (numberOfAttempts < maxAttempts) {
                    System.out.print("Enter your guess: ");
                    int userGuess = scanner.nextInt();
                    numberOfAttempts++;

                    if (userGuess < numberToGuess) {
                        System.out.println("Too low! Try again.");
                    } else if (userGuess > numberToGuess) {
                        System.out.println("Too high! Try again.");
                    } else {
                        System.out.println("Congratulations! You guessed the number in " + numberOfAttempts + " attempts.");
                        hasWon = true;
                        score += (maxAttempts - numberOfAttempts + 1);  // Higher score for fewer attempts
                        break;
                    }
                }

                if (!hasWon) {
                    System.out.println("Sorry! You've exhausted all attempts. The number was: " + numberToGuess);
                }

                System.out.println("Your current score: " + score);
                System.out.print("Would you like to play again? (yes/no): ");
                playAgain = scanner.next().equalsIgnoreCase("yes");
            }

            System.out.println("Thank you for playing! Your final score is: " + score);
            scanner.close();
        }
    }


