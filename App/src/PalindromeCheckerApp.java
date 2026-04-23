 uc6
import java.util.*;


 uc6
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Declare and initialize input string
        String input = "noon";

        // Create stack
        Stack<Character> stack = new Stack<>();

        // Push each character into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

 uc4 main
public class PalindromeCheckerApp {

    public static void main(String[] args) {

 uc6
        // Define input
        String input = "civic";

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Insert characters into both structures
        for (char c : input.toCharArray()) {
            queue.add(c);     // enqueue
            stack.push(c);    // push
        }

        // Declare and initialize input
        String input = "radar";

        // Convert string to character array
        char[] chars = input.toCharArray();

        // Initialize pointers
        int start = 0;
        int end = chars.length - 1;
 main
 main

        // Assume palindrome
        boolean isPalindrome = true;
 uc5
        // Pop and compare with original string
        for (char c : input.toCharArray()) {

 uc6
        // Compare dequeue vs pop
        while (!queue.isEmpty()) {

            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }

        // Compare until pointers cross
        while (start < end) {
 main

            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
 uc5
        }

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);


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
 main
        }
 uc4
        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

 uc6
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
 main
 main
    }
}