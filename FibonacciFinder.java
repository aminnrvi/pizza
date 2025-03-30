import java.util.Scanner;

public class FibonacciFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner for user input

        System.out.println("Enter the Fibonacci index: ");
        int number = scanner.nextInt(); // Read input from user

        // Compute Fibonacci using recursion
        System.out.println("The Fibonacci number is " + fibonacci(number));

        scanner.close(); // Close scanner to prevent resource leaks
    }

    /**
     * This method computes the nth Fibonacci number using recursion.
     *
     * @param n The index of the Fibonacci sequence.
     * @return The nth Fibonacci number.
     */
    public static long fibonacci(int n) {
        if (n <= 1) { // Base case: Fibonacci(0) = 0, Fibonacci(1) = 1
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call
    }

    /**
     * Time Complexity Analysis:
     * - This recursive approach **recomputes** values multiple times.
     * - Each call spawns **two** new recursive calls.
     * - The number of calls grows **exponentially** as `O(2^n)`.
     *
     * Overall Time Complexity: **O(2^n)** (very inefficient for large `n`)
     *
     * Space Complexity: **O(n)** (due to recursion stack depth)
     */
}
