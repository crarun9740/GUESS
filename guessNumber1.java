import java.util.Scanner;
import java.util.Random;

public class guessNumber1 {

    public static void main(String[] args) {
        guessNumber1();
    }

    public static void  guessNumber1() {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int maxTries = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("Try to guess the number between 1 and 100. You have " + maxTries + " tries.");

        for (int attempt = 1; attempt <= maxTries; attempt++) {
            System.out.print("Attempt " + attempt + ": Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess == secretNumber) {
                System.out.println("You guessed the correct number " + secretNumber + " in " + attempt + " attempts.");
                break;
            } else {
                if (attempt == maxTries) {
                    System.out.println("Sorry, you've run out of attempts. The correct number was " + secretNumber + ".");
                } else {
                    if (userGuess < secretNumber) {
                        System.out.println("Try again! The correct number is higher.");
                    } else {
                        System.out.println("Try again! The correct number is lower.");
                    }
                }
            }
        }

        scanner.close();
    }
}

