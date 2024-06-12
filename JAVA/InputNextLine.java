
import java.util.Scanner;

public class InputNextLine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name : ");
        String name = sc.next(); // เมื่อมีการกด space จะไม่อ่านข้อความที่อยู่หลัง space
        System.out.println("Outpu name : " + name);
    }
}
