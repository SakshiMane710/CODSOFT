import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;

        String playAgain;

        do {
            int number = rand.nextInt(50) + 1;
            int guess;
            int attempts = 0;
            int maxAttempts = 5;
            boolean guessed = false;

            System.out.println("\nNew Round! Guess the number between 1 and 50");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess < number) {
                    System.out.println("Too low!");
                } else if (guess > number) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                    score++;
                    guessed = true;
                    break;
                }
            }

            if (!guessed) {
                System.out.println("Sorry! The number was: " + number);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = sc.next().toLowerCase();

        } while (playAgain.equals("yes"));

        System.out.println("\nGame Over! Your total score (rounds won): " + score);
        sc.close();
    }
}
