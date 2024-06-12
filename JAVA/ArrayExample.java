public class ArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array of integers with 5 elements
        int[] numbers = new int[5];

        // Assign values to the array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Print the values of the array
        System.out.println("\nArray elements are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + " : " + numbers[i]);
        }

        // Another way to initialize an array with values
        int[] predefinedNumbers = {100, 200, 300, 400, 500};

        // Print the values of the predefined array
        System.out.println("\nPredefined array elements are:");
        for (int i = 0; i < predefinedNumbers.length; i++) {
            System.out.println("Element at index " + i + " : " + predefinedNumbers[i]);
        }

        System.out.println("\nLength of Array: " + numbers.length);

        // Using a for loop to iterate through the array
        System.out.println("\nUsing for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + " : " + numbers[i]);
        }

        // Using a for-each loop to iterate through the array
        System.out.println("\nUsing for-each loop:");
        for (int number : numbers) {
            System.out.println("Element: " + number);
        }
    }
}
