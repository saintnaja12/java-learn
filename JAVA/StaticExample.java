public class StaticExample {

    // Public static int method
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Public static void method
    public static void displayMultiplication(int a, int b) {
        int product = multiply(a, b);
        System.out.println("Product: " + product);
    }

    public static void main(String[] args) {
        // Call static methods using the class name
        int result = StaticExample.multiply(4, 6);
        System.out.println("Result: " + result);

        StaticExample.displayMultiplication(4, 6);
    }
}
