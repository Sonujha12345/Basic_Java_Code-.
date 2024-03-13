package com.september;
import java.util.Scanner;
public class Strings12 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a string");
            String input = scanner.nextLine();
            // Count and display the number of vowels, consonants, digits, and special characters
            countCharacterTypes(input);
        }
        // Function to count character types and display the counts
        public static void countCharacterTypes(String str) {
            int vowels = 0;
            int consonants = 0;
            int digits = 0;
            int specialCharacters = 0;
            str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive counting
            for (char c : str.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                } else if (c >= '0' && c <= '9') {
                    digits++;
                } else {
                    specialCharacters++;
                }
            }
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Digits: " + digits);
            System.out.println("Special Characters: " + specialCharacters);
        }
    }

