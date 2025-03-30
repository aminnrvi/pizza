import java.util.Scanner;

public class DigitCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for user input

        System.out.println("Enter a string:");
        String s = sc.nextLine(); // Read user input as a string

        // Check if the string consists of only digits
        if (isAllDigits(s)) {
            System.out.println("Yes"); // If all characters are digits
        } else {
            System.out.println("No"); // If any non-digit character is found
        }

        sc.close(); // Close scanner to prevent resource leaks
    }

    /**
     * This method checks if a given string consists entirely of digits using recursion.
     *
     * @param s The input string to check.
     * @return True if the string contains only digits, false otherwise.
     */
    public static boolean isAllDigits(String s) {
        if (s.isEmpty()) { // Base case: If the string is empty, return true
            return true;
        }
        if (!Character.isDigit(s.charAt(0))) { // If the first character is not a digit, return false
            return false;
        }
        return isAllDigits(s.substring(1)); // Recursive call on the remaining substring
    }

    /**
     * Time Complexity Analysis:
     * - Each recursive call processes **one** character of the string.
     * - There are **n** recursive calls for a string of length **n**.
     * - String substring operation takes **O(n)** in Java, leading to an **O(n^2)** total complexity.
     *
     * Overall Time Complexity: **O(n^2)** (due to string substring creation at each step)
     *
     * Space Complexity: **O(n)** (due to recursion depth)
     */
}