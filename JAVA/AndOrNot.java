import java.util.Scanner;
public class AndOrNot {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = kb.nextInt();

        if(age >= 15 && age <= 19){
            System.out.println("Teen age");
        }else if(age < 19){
            System.out.println("Childhood age");
        }else {
            System.out.println("Adult age");
        }
    }
}
