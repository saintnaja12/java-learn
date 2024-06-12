
public class Variable {
    public static void main(String[] args){
        // นิยามตัวแปรแบบไม่ระบุค่าเริ่มต้น ---------------------------
        int number1;
        boolean status;
        char alphabet;
        float number2;
        double number3;

        // นิยามตัวแปรแบบระบุค่าเริ่มต้น
        Integer number4 = 10;
        float number5 = 20.5f;
        char alphabet2 = 'A';
        boolean status2 = true;

        // หลายบรรทัดใยครั้งเดียว
        int a = 0, b = 1, c = 2;

        // System.out.println("number4 " + number4);
        // System.out.println("number5 " + number5);

        // ค่าคงที่ final ---------------------------
        final int NUM = 100;
        final char ALPHABET = 'B';
        final int NUM2;
        NUM2 = 200;

        // การตั้งชื่อตัวแปร ---------------------------
        int n;
        int _n;

        // keyword ---------------------------
        /* int 1num$ = 100; wrong! */
        /* int @num = 100; wrong! */
        // Global variable ---------------------------
        int $num = 50;
        {
            // Local variable ---------------------------
            int c2 = 300;
            // System.out.println(c2);
            // System.out.println($num);
        }
        // System.out.println($num);

        // ค่าต่ำสุด สูงสุด ---------------------------
        // System.out.println("Integer MIN " + Integer.MIN_VALUE);
        // System.out.println("Integer MAX " + Integer.MAX_VALUE);

        // Widening Casting แปลงชนิดข้อมูลจากเล็กไปใหญ่ ---------------------------
        int numInt = 10;
        double numDouble = numInt;
        // System.out.println(numInt);
        // System.out.println(numDouble);

        // Narrowing Casting แปลงชนิดข้อมูลจากใหญ่ไปเล็ก ---------------------------
        double numDouble2 = 10.0;
        int numInt2 = (int)numDouble2;
        // System.out.println(numDouble2);
        // System.out.println(numInt2);


        /* String ---------------------------
        String คือ ชนิดข้อมูลที่เก็บข้อความ
        symbol = ""

        char เก็บตัวอักษร
        symbol = ''

        char เรียงต่อกัน = > String
        */

        char charA = 'a';
        String stringA = "100", stringB = "200";

        int intC;
        intC = Integer.parseInt(stringB) + 50; // String to int

        double doubleC = Double.parseDouble(stringA) + 50.55; // String to double
        // System.out.println(stringA);
        // System.out.println(stringB);
        // System.out.println(intC);
        // System.out.println(doubleC);

        int num100 = 100;
        String age = String.valueOf(num100);
        // int to String
        // System.out.println(age);

        // check variables type --------------------------- `instanceof` ต้องใช้ชื่อ class ของชนิดข้อมูลนั้นๆ
        // int number4 = 10;
        // float number5 = 20.5f;
        // char alphabet2 = 'A';
        // boolean status2 = true;

        boolean resultA = number4 instanceof Integer;
        System.out.println(resultA);
    }
}
