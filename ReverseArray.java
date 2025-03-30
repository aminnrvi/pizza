import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for user input

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt(); // Read the number of elements
        int[] arr = new int[n]; // Initialize an array of size 'n'

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) { // Loop to read 'n' elements
            arr[i] = sc.nextInt();
        }
        // Time Complexity: O(n) - Each element is read once and stored in the array.

        reverseArray(arr, 0, n - 1); // Call recursive function to reverse the array
        // Time Complexity: O(n) - Each element is swapped once, leading to O(n) recursion depth.

        System.out.println("Reversed array:");
        for (int num : arr) { // Loop to print the reversed array
            System.out.print(num + " ");
        }
        // Time Complexity: O(n) - Printing each element once.
    }

    /**
     * This method reverses the array using recursion.
     * It swaps elements from the start and end and moves towards the middle.
     *
     * @param arr   The array to be reversed.
     * @param start The starting index for swapping.
     * @param end   The ending index for swapping.
     */
    public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) { // Base case: Stop when start index crosses end index
            return;
        }

        // Swap elements at start and end positions
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call for the remaining array
        reverseArray(arr, start + 1, end - 1);
    }
    // Time Complexity: O(n)
    // - Each recursive call processes two elements (start and end).
    // - The total number of recursive calls is approximately n/2.
    // - O(n/2) simplifies to O(n), which is the final time complexity.
}