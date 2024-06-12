

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input 1 : ");
        int a = sc.nextInt();
        System.out.print("Input 2 : ");
        int b = sc.nextInt();

        System.out.println("Summary plus : " + (a+b));
        System.out.println("Summary minus : " + (a-b));
        System.out.println("Summary multiple : " + (a*b));
        System.out.println("Summary divider : " + (a/b));
        System.out.println("Summary modulus : " + (a%b));

        // --------------------------------------------
    }
}
