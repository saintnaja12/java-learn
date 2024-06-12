import java.util.Scanner;
public class NestedLoops {
    public static void main(String[] args) {
        // Create a Scanner object for keyboard input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Prompt the user for the number of columns
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Use nested loops to print the rectangle
        for (int i = 0; i < rows; i++) { // Outer loop for rows
            for (int j = 0; j < columns; j++) { // Inner loop for columns
                System.out.print("*"); // Print asterisk without newline
            }
            System.out.println(); // Move to the next line after printing a row
        }

        // Close the scanner
        scanner.close();
    }
}
