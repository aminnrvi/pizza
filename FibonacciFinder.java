import java.util.Scanner;

public class FibonacciFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the fibonacci number: ");
        int number = scanner.nextInt();
        System.out.println("The fibonacci number is " + fibonacci(number));
    }

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
