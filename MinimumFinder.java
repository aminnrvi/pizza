import java.util.Scanner;

public class MinimumFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for user input

        int n = scanner.nextInt(); // Read the number of elements
        int[] arr = new int[n]; // Create an array of size n

        // Read array elements from user input
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int min = findMin(arr, n); // Find the minimum element in the array

        System.out.println(min); // Print the minimum value

        scanner.close(); // Close scanner to prevent resource leaks
    }

    /**
     * This method finds the minimum element in an array using iteration.
     *
     * @param arr The input array.
     * @param n The number of elements in the array.
     * @return The minimum value in the array.
     */
    public static int findMin(int[] arr, int n) {
        int min = arr[0]; // Initialize min with the first element

        // Iterate through the array to find the minimum element
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) { // If a smaller element is found, update min
                min = arr[i];
            }
        }
        return min; // Return the minimum value
    }

    /**
     * Time Complexity Analysis:
     * - Iterating through the array takes **O(n)** time.
     * - Each comparison runs in **O(1)**.
     *
     * Overall Time Complexity: **O(n)**
     *
     * Space Complexity: **O(1)** (constant space used for `min` variable)
     */
}