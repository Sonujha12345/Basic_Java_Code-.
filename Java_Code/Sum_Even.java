package com.september;

import java.util.Scanner;

public class Sum_Even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numbers: ");
        int n=sc.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++){
            sum+=2*i;
            System.out.println("The sum of even numbers : "+sum);
        }
    }
}
