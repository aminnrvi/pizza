import java.util.Scanner;

public class PowerFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        System.out.println("Enter 2 numbers: ");
        int n = scanner.nextInt(); // Base number
        int m = scanner.nextInt(); // Exponent

        int result = findPower(n, m); // Compute power using iteration

        // Print the result
        System.out.println(n + " power of " + m + " is " + result);

        scanner.close(); // Close scanner to prevent resource leaks
    }

    /**
     * This method calculates the power of a number using iteration.
     * It performs repeated multiplication `m` times.
     *
     * @param n The base number.
     * @param m The exponent.
     * @return The result of n^m.
     */
    public static int findPower(int n, int m) {
        int result = 1; // Initialize result to 1 (multiplicative identity)

        // Loop runs m times, multiplying the base n each time
        for (int i = 0; i < m; i++) {
            result *= n; // Multiply result by n in each iteration
        }

        return result; // Return the final computed power
    }

    /**
     * Time Complexity Analysis:
     * - The loop runs exactly `m` times.
     * - Each iteration performs a single multiplication operation.
     *
     * Overall Time Complexity: **O(m)**
     *
     * Space Complexity: **O(1)** (constant space used for `result` variable)
     */
}