import java.util.Scanner;

public class Assignment4 {
    // convert Buddhist era to Christian era
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Buddhist era: ");
        int number = sc.nextInt();

        int result = number - 543;
        System.out.println("Christian era: " + result);
    }
}
