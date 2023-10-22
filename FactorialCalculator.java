public class FactorialCalculator {
    public static void main(String[] args) {
        int number = 5; // Change this to the number for which you want to calculate the factorial.
        long factorial = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1; // Base case: 0! = 1
        } else {
            return n * calculateFactorial(n - 1); // Recursive case: n! = n * (n-1)!
        }
    }
}
