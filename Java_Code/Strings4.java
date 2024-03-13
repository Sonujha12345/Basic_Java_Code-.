package com.september;
import java.util.Scanner;
public class Strings4 {
    /*
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            // Check if the input string is a palindrome
            boolean isPalindrome = checkPalindrome(input);
            // Print the result
            if (isPalindrome) {
                System.out.println("The input string is a palindrome.");
            } else {
                System.out.println("The input string is not a palindrome.");
            }
        }
        // Function to check if a string is a palindrome
        public static boolean checkPalindrome(String str) {
            int left = 0;
            int right = str.length() - 1;
            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }

     */

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            // Remove duplicate characters from the input string
            String result = removeDuplicates(input);
            // Print the resulting string
            System.out.println(result);
        }
        // Function to remove duplicate characters from a strins
        public static String removeDuplicates(String str) {
            StringBuilder result = new StringBuilder();
            boolean[] seen = new boolean[256]; // Assuming ASCII characters
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (!seen[ch]) {
                    result.append(ch);
                    seen[ch] = true;
                }
            }
            return result.toString();
        }
    }

