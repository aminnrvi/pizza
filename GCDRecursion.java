import java.util.Scanner;

public class GCDRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(); // Read first number
        int b = sc.nextInt(); // Read second number

        // Compute and print the GCD using recursion
        System.out.println("GCD: " + findGCD(a, b));

        sc.close(); // Close scanner to prevent resource leaks
    }

    /**
     * This method finds the Greatest Common Divisor (GCD) of two numbers
     * using the **Euclidean Algorithm**.
     *
     * @param a First number.
     * @param b Second number.
     * @return The GCD of a and b.
     */
    public static int findGCD(int a, int b) {
        if (b == 0) { // Base case: If remainder is 0, return a
            return a;
        }
        return findGCD(b, a % b); // Recursive call with (b, remainder of a/b)
    }

    /**
     * Time Complexity Analysis:
     * - Euclidean Algorithm reduces the problem size **logarithmically**.
     * - The number of recursive calls is proportional to **O(log(min(a, b)))**.
     * - Much faster than **O(n)** brute force approach.
     *
     * Overall Time Complexity: **O(log min(a, b))**
     *
     * Space Complexity: **O(log min(a, b))** (due to recursion stack)
     */
}