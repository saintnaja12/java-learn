import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        // NumberGuessingGame Create a Scanner object for keyboard input
        Scanner scanner = new Scanner(System.in);

        // Define the number to guess
        int numberToGuess = 7; // You can change this to any number
        int userGuess;

        // Start the do-while loop
        do {
            // Prompt the user for input
            System.out.print("Guess the number: ");
            userGuess = scanner.nextInt();

            // Provide feedback
            if (userGuess > numberToGuess) {
                System.out.println("Too high, try again.");
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low, try again.");
            }
        } while (userGuess != numberToGuess); // Repeat until the user guesses correctly

        // Congratulate the user
        System.out.println("Congratulations! You guessed the number.");

        // Close the scanner
        scanner.close();
    }
}
