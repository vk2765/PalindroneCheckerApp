 uc4
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Declare and initialize input
        String input = "radar";

        // Convert string to character array
        char[] chars = input.toCharArray();

        // Initialize pointers
        int start = 0;
        int end = chars.length - 1;

        // Assume palindrome
        boolean isPalindrome = true;

        // Compare until pointers cross
        while (start < end) {

            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }

uc3
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String reversed = "";
 main

        // Iterate from last character to first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }
 uc4
        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

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
 main
    }
}