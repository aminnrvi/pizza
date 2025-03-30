import java.util.Scanner;

public class FactorialFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner for user input

        System.out.println("Enter the number to calculate the factorial: ");
        int number = scanner.nextInt(); // Read input number

        // Compute and print the factorial using iteration
        System.out.println("The factorial of " + number + " is " + factorial(number));

        scanner.close(); // Close scanner to prevent resource leaks
    }

    /**
     * This method computes the factorial of a number iteratively.
     *
     * @param n The number for which factorial is computed.
     * @return The factorial of n.
     */
    public static long factorial(int n) {
        long fact = 1; // Initialize factorial result to 1

        // Loop from 1 to n, multiplying each number
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact; // Return the computed factorial
    }

    /**
     * Time Complexity Analysis:
     * - The loop runs **n** times.
     * - Each iteration performs a **constant-time multiplication**.
     *
     * Overall Time Complexity: **O(n)**
     *
     * Space Complexity: **O(1)** (constant space used for `fact` variable)
     */
}