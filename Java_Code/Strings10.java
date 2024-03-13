package com.september;

import java.util.Scanner;

public class Strings10 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string: ");
            String input = sc.nextLine();
            // Reverse the string with intact space positions and display the modified string
            String reversedString = reverseStringWithSpacePositionsIntact(input);
            System.out.println(reversedString);
        }
        // Function to reverse the string with intact space positions
        public static String reverseStringWithSpacePositionsIntact(String str) {
            char[] charArray = str.toCharArray();
            int left = 0;
            int right = charArray.length - 1;
            while (left < right) {
                if (charArray[left] != ' ' && charArray[right] != ' ') {
                    char temp = charArray[left];
                    charArray[left] = charArray[right];
                    charArray[right] = temp;
                    left++;
                    right--;
                } else if (charArray[left] == ' ') {
                    left++;
                } else if (charArray[right] == ' ') {
                    right--;
                }
            }
            return new String(charArray);
        }
    }






