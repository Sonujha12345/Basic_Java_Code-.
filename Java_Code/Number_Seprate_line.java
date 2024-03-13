package com.september;

import java.util.Scanner;

public class Number_Seprate_line {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int rem=0;
        int quo=0;
        int sum=0;
        while (n>0){
             rem=n%10;
             quo=n%10;
           n=quo;
           sum+=rem;
            System.out.println(rem);
            n--;
             }
        System.out.println("The sum: "+sum);
    }
}
