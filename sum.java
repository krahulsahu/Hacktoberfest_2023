public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25}; // Example array

        // Calculate the sum of array elements
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\nSum of array elements: " + sum);
    }
}
