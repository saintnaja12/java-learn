import java.util.Scanner;
public class ControlStructure {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = kb.nextInt();
        if(age > 15){
            System.out.println("age > 15");
        }
        else {
            System.out.println("age <= 15");
        }
    }
}
