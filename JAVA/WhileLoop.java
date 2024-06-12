import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Enter numbers to sum (enter 0 to quit):");

        int sum = 0;
        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            sum += number;
        }

        System.out.println("The sum of the entered numbers is: " + sum);
    }
}
