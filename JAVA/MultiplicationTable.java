import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object for keyboard input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a number
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = scanner.nextInt();

        // Generate the multiplication table
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 12; i++) { // Loop from 1 to 10
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        // Close the scanner
        scanner.close();
    }
}
