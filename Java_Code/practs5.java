package com.september;
import java.util.Scanner;

class Practs5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int difference = Math.abs(num1 - num2);

        System.out.println("The absolute difference between " + num1 +
                " and " + num2 + " is: " + difference);

        scanner.close();

    }
}

