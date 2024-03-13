package com.september;

import java.util.Scanner;

public class Prime_Sum {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numbers: ");
        int n=sc.nextInt();
            int sum = 0;
            for (int i = 2; i <= n; i++) {
                if (isPrime(i)) {
                    sum += i;
                    System.out.println("The sum of prime numbers : "+sum);
                }
            }

        }

    }

