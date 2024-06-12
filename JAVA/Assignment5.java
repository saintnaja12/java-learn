import java.util.Scanner;
public class Assignment5 {
    // BMI Calculator

    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "ต่ำกว่าเกณฑ์"; // Underweight
        } else if (bmi >= 18.5 && bmi <= 22.9) {
            return "สมส่วน"; // Normal weight
        } else if (bmi >= 23.0 && bmi <= 24.9) {
            return "น้ำหนักเกิน"; // Overweight
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            return "โรคอ้วน"; // Obese
        } else {
            return "โรคอ้วนระดับอันตราย"; // Severely obese
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Weight (KG) : ");
        double weight = sc.nextDouble();

        System.out.print("Height (CM) : ");
        double height = sc.nextDouble();
        height /= 100;

        double bmi = weight / (height * height);

        System.out.println(weight);
        System.out.println(height);
        System.out.println("BMI : " + bmi + " - " + getBMICategory(bmi));
    }
}
