package com.september;

import java.util.Scanner;

public class Odd_While_Loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numbers:");
        int n=sc.nextInt();
        int i=1;
        while (i<n){
            System.out.println("The odd numbers: "+(2*i-1));
            i++;
        }
    }
}
