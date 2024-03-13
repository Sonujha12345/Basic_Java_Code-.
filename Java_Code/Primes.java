package com.september;

import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n = sc.nextInt();
        System.out.println("Enter a number a: ");
        int a = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= a; i++) {
            if (n % i == 0 && isPrime(i)) {
                System.out.println("Prime factor: " + i);
                count++;
            }
        }

        System.out.println("The count of prime factors: " + count);
    }

    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
