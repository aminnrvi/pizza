import java.util.Scanner;

public class PrimeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating Scanner object for user input

        System.out.println("Enter the number: ");
        int number = scanner.nextInt(); // Read user input

        // Check if the number is prime and print the result
        System.out.println(number + " is " + (isPrime(number) ? "prime" : "not prime"));

        scanner.close(); // Close scanner to prevent resource leaks
    }

    /**
     * This method checks whether a given number is prime.
     * It uses an optimized approach by:
     * - Handling small cases separately (2 is prime, even numbers > 2 are not)
     * - Checking divisibility from 3 to sqrt(n) with a step of 2 (only odd numbers)
     *
     * @param number The number to check for primality.
     * @return true if the number is prime, false otherwise.
     */
    public static boolean isPrime(int number) {
        if (number < 2) { // Numbers less than 2 are not prime
            return false;
        }
        if (number == 2) { // 2 is the only even prime number
            return true;
        }
        if (number % 2 == 0) { // Eliminate all even numbers greater than 2
            return false;
        }

        // Check divisibility from 3 to sqrt(n), skipping even numbers
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) { // If divisible, it's not a prime
                return false;
            }
        }
        return true; // If no divisors were found, the number is prime
    }

    /**
     * Time Complexity Analysis:
     * - Checking small cases (O(1))
     * - Iterates from 3 to sqrt(n), skipping even numbers → **O(√n)**
     * - Efficient for large numbers compared to O(n) brute force.
     *
     * Overall Time Complexity: **O(√n)**
     */
}