public class MethodExample {

    // Method to calculate the sum of two integers
    public int sum(int a, int b) {
        return a + b;
    }

    // Method to print a message
    public void printMessage(String message) {
        System.out.println(message);
    }

    // Static method to calculate the factorial of a number
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // Creating an object of the class to call instance methods
        MethodExample example = new MethodExample();

        // Calling the sum method
        int result = example.sum(10, 20);
        System.out.println("Sum: " + result);

        // Calling the printMessage method
        example.printMessage("Hello, World!");

        // Calling the static factorial method
        int fact = MethodExample.factorial(5);
        System.out.println("Factorial of 5: " + fact);
    }
}
