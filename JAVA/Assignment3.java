import java.util.Scanner;

public class Assignment3 {
    // even || odd number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input integer: ");
        int number = sc.nextInt();

        String result = "";
        // if(number % 2 == 0) {
        //     System.out.print("value even ");
        // }else {
        //     System.out.print("value odd ");
        // }

        result = (number % 2 == 0) ? "value even " : "value odd ";
        System.out.println(result);
    }
}
