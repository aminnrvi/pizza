import java.util.Scanner;

public class BinomialCoefficient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner for user input

        System.out.print("Enter n: ");
        int n = scanner.nextInt(); // Read input n

        System.out.print("Enter k: ");
        int k = scanner.nextInt(); // Read input k

        // Compute binomial coefficient using recursion
        System.out.println("C(" + n + ", " + k + ") = " + binomialCoeff(n, k));

        scanner.close(); // Close scanner to prevent resource leaks
    }

    /**
     * This method computes the binomial coefficient C(n, k) using recursion.
     *
     * @param n The total number of elements.
     * @param k The number of selected elements.
     * @return The binomial coefficient C(n, k).
     */
    public static int binomialCoeff(int n, int k) {
        if (k == 0 || k == n) { // Base case: C(n, 0) = 1 and C(n, n) = 1
            return 1;
        }

        // Recursive relation: C(n, k) = C(n-1, k-1) + C(n-1, k)
        return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
    }

    /**
     * Time Complexity Analysis:
     * - The function **splits into two recursive calls** at each step.
     * - The recursion depth is **O(n)**.
     * - The total number of function calls follows the **binomial expansion**, leading to **O(2^n) complexity**.
     *
     * Overall Time Complexity: **O(2^n)**
     *
     * Space Complexity: **O(n)** (due to recursion depth)
     */
}