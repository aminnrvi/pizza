import java.util.Scanner;

public class DigitCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine(); // Read user input

        if (isAllDigits(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isAllDigits(String s) {
        if (s.isEmpty()) { // Base case: If the string is empty, it's valid
            return true;
        }
        if (!Character.isDigit(s.charAt(0))) { // If the first char is not a digit, return false
            return false;
        }
        return isAllDigits(s.substring(1)); // Recursive call on the rest of the string
    }
}