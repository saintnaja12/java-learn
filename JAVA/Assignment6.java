import java.util.Scanner;
public class Assignment6 {
    // BanknoteExchange
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Money: ");
        int amountToExchange = sc.nextInt(); // Change this value to test different amounts

        int[] denominations = {1000, 500, 100, 50, 20};

        // Calculate the number of bills for each denomination
        for (int denomination : denominations) {
            int numBills = amountToExchange / denomination;
            amountToExchange %= denomination; // Update remaining amount
            if (numBills > 0 && amountToExchange > 10) {
                System.out.println("Banknotes of " + denomination + " baht: " + numBills);
            }
        }
        System.out.println("Remaining Balance: " + amountToExchange);
    }
}
