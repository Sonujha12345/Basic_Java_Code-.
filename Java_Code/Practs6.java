package com.september;

import java.util.Scanner;

public class Practs6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=sc.nextInt();
        sc.close();
//        if (a % 2 == 0){
//            System.out.println("Number is even..");
//        }else {
//            System.out.println("Number is odd..");
//        }
        if (a%2==0){
            System.out.println("even");
        }
        if (a%2!=0){
            System.out.println("odd");
        }
    }
}
