import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        // Create a Scanner object for keyboard input
        Scanner scanner = new Scanner(System.in);
        int userInput;

        // Start the do-while loop
        do {
            // Prompt the user for input
            System.out.print("Enter a number (negative number to exit): ");
            userInput = scanner.nextInt();

            // Check if the input is a negative number
            if (userInput < 0) {
                System.out.println("Negative number entered. Exiting...");
                break; // Exit the loop
            }

            // Check if the number is a multiple of 5
            if (userInput % 5 == 0) {
                System.out.println("Skipping multiple of 5.");
                continue; // Skip the rest of the loop and prompt again
            }

            // Print the number
            System.out.println("You entered: " + userInput);

        } while (true); // Infinite loop, will break if a negative number is entered

        // Close the scanner
        scanner.close();
    }
}
