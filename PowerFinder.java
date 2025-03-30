import java.util.Scanner;

public class PowerFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int result = findPower(n, m);
        System.out.println(n + " power of " + m + " is " + result);
    }

    public static int findPower(int n, int m) {
        int result = 1; // Initialize to 1

        for (int i = 0; i < m; i++) { // Run the loop m times
            result *= n; // Multiply result by n in each iteration
        }

        return result;
    }
}