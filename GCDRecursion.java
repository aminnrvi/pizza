import java.util.Scanner;

public class GCDRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD: " + findGCD(a, b));
        sc.close();
    }

    public static int findGCD(int a, int b) {
        if (b == 0) { // Base case: If remainder is 0, return a
            return a;
        }
        return findGCD(b, a % b); // Recursive call
    }
}