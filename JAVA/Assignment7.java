import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input temperature: ");
        double temperature = sc.nextInt();

        double celsius = temperature;
        double fahrenheit = 0.0;

        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Celsius: " + celsius);
        System.out.println("Farenheit: " + fahrenheit);
    }
}
