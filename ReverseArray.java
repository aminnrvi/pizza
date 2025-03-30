import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArray(arr, 0, n - 1); // Call recursive function

        System.out.println("Reversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) { // Base case: Stop when start >= end
            return;
        }

        // Swap elements at start and end positions
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call for the remaining array
        reverseArray(arr, start + 1, end - 1);
    }
}