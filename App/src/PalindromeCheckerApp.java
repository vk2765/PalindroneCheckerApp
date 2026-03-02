 uc4

public class UseCase4PalindromeCheckerApp {

    /**
     * Application entry point for UC4.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Declare and initialize the input string
        String input = "radar";

        // Convert the string into a character array
        char[] chars = input.toCharArray();

        // Initialize pointer at the beginning
        int start = 0;

        // Initialize pointer at the end
        int end = chars.length - 1;

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Continue comparison until pointers cross
        while (start < end) {

            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");


public class UseCase3PalindromeCheckerApp {


    public static void main(String[] args) {

        // Hardcoded input string
        String input = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Iterate from the last character to the first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Display original and reversed strings
        System.out.println("Original String : " + input);
        System.out.println("Reversed String : " + reversed);

        // Compare using equals() method
        if (input.equals(reversed)) {
            System.out.println("Result : The string is a Palindrome.");
 main
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}