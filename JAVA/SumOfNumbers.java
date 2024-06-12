import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for keyboard input
        Scanner scanner = new Scanner(System.in);

        int sum = 0; // Initialize sum to 0
        int min = Integer.MAX_VALUE; // Initialize min to maximum integer value
        int max = Integer.MIN_VALUE; // Initialize max to minimum integer value
        int number;

        // Prompt the user for input until they enter 0
        do {
            System.out.print("Enter a number (0 to stop): ");
            number = scanner.nextInt();

            if (number != 0) {
                sum += number; // Add the input number to the sum

                // Update min and max
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            }
        } while (number != 0); // Continue until the user enters 0

        // Display the sum of the entered numbers
        System.out.println("The sum of the entered numbers is: " + sum);

        // Check if the sum is odd or even
        if (sum % 2 == 0) {
            System.out.println("The sum is even.");
        } else {
            System.out.println("The sum is odd.");
        }

        // Display the minimum and maximum numbers entered
        if (min != Integer.MAX_VALUE && max != Integer.MIN_VALUE) {
            System.out.println("The minimum number entered is: " + min);
            System.out.println("The maximum number entered is: " + max);
        } else {
            System.out.println("No valid numbers were entered.");
        }

        // Close the scanner
        scanner.close();
    }
}
