import java.util.Scanner;

public class Assignment2 {
    // Compare number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input Number 1: ");
        int number1 = sc.nextInt();
        System.out.print("Input Number 2: ");
        int number2 = sc.nextInt();

        if(number1 > number2){
            System.out.println(number1 + " > " + number2);
        }else if(number1 < number2) {
            System.out.println(number1 + " < " + number2);
        }else {
            System.out.println(number1 + " = " + number2);
        }
    }
}
