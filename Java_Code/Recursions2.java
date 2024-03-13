package com.september;

import java.util.Scanner;

public class Recursions2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int s=sc.nextInt();
        int c=factorial(s);
        System.out.println(c);

    }
   static int count=0;
    static int factorial(int n){
        System.out.println(count);
        if (n==0||n==1){
            return 1;
        }
        count++;
        System.out.println("count>>"+count);
        return n*factorial(n-1);
    }
}
