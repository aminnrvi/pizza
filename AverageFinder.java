import java.util.Scanner;

public class AverageFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for user input

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt(); // Read the number of elements

        int[] array = new int[n]; // Initialize an array of size n

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) { // Read elements into the array
            array[i] = scanner.nextInt();
        }

        double average = findAverage(array); // Compute the average
        System.out.println("Average: " + average); // Print the result

        scanner.close(); // Close the scanner to prevent resource leaks
    }

    /**
     * This method calculates the average of an integer array.
     *
     * @param array The input array.
     * @return The average value of the array elements.
     */
    public static double findAverage(int[] array) {
        double sum = 0; // Variable to store the sum of elements

        for (int i = 0; i < array.length; i++) { // Traverse the array
            sum += array[i]; // Add each element to sum
        }

        return sum / array.length; // Return the average (sum divided by count)
    }

    /**
     * Time Complexity Analysis:
     * - Loop iterates **n** times to compute the sum.
     * - Constant time **O(1)** for division.
     * - Overall complexity: **O(n)** (linear time complexity).
     *
     * Space Complexity:
     * - Uses an array of **size n**, so **O(n)**.
     * - The function itself uses only a few extra variables (**O(1)** additional space).
     */
}