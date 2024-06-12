import java.util.Scanner;
public class Assignment1 {
    // BMI Calculator
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Weight (KG) : ");
        double weight = sc.nextDouble();

        System.out.print("Height (CM) : ");
        double height = sc.nextDouble();
        height = height / 100;

        double bmi = weight / (height * height);

        System.out.println(weight);
        System.out.println(height);
        System.out.println("BMI : " + bmi);
    }
}
