package com.september;

import java.util.Scanner;

public class Odd_Do_While_Loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numbers: ");
        int n=sc.nextInt();
        int i=1;
        do {
            System.out.println("The odd numbers: "+(2*i-1));
            i++;
        }while (i<n);

    }
}
