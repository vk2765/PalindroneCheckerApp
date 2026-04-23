uc3
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String reversed = "";

        // Iterate from last character to first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed
        if (input.equals(reversed)) {
            System.out.println("Is it a Palindrome?: true");
        } else {
            System.out.println("Is it a Palindrome?: false");
        }

        sc.close();

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string
        String input = "madam";

        boolean isPalindrome = true;

        // Loop till half of the string length
        for (int i = 0; i < input.length() / 2; i++) {

            // Compare characters from both ends
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome?: " + isPalindrome
                           main
    }
}