import java.util.Scanner;

public class FactorialFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to calculate the factorial: ");
        int number = scanner.nextInt();
        System.out.println("The factorial of " + number + " is " + factorial(number));
    }

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
