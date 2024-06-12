
import java.util.Scanner;

public class InputTutorial {
    public static void main(String[] args){
        // ประการใช้งาน Class | new
        Scanner sc = new Scanner(System.in);
        System.out.print("Input String = ");
        String name = sc.nextLine(); // รับค่า String จาก keyboard => name

        System.out.print("Input Integer = ");
        int year = sc.nextInt();

        int age = 2567 - year;

        System.out.println("Output String name = " + name);
        System.out.println("Output Integer age = " + age);
    }
}
