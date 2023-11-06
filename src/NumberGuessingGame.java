import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new
                Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 5;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        boolean playAgain = true;
        while (playAgain) {
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("I've generated a number between"  + minRange +   "and"  + maxRange +   "Try to guess it!");
            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.println("Enter yout guess: ");
                int userGuess = scanner.nextInt();
                scanner.nextLine();

                if (userGuess == randomNumber) {
                    System.out.println("Congradulations! You guessed the correct number. ");
                    guessedCorrectly = true;

                } else if (userGuess < randomNumber) {
                    System.out.println("Two low! Try a higher number.");

                } else {


                    System.out.println("Too high! Try a lower number.");
                }
                attempts++;
            }
            if (guessedCorrectly) {
                score++;

            } else {
                System.out.println("Sorry, you've used all your attempts. The correct number was: " + randomNumber);
            }
            System.out.println("Your current score:" + score);
            System.out.println("Do you want to plau again?(yes/no)");
            String playAgainInput = scanner.nextLine();
            playAgain = playAgainInput.equalsIgnoreCase("yes");

            System.out.println("Thanks for playing! Your final score is: " + score);
            scanner.close();


        }
    }
}
