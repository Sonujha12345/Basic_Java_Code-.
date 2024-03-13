package com.september;

import java.util.Scanner;

public class Practs7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numbers: ");
        int num=sc.nextInt();
        sc.close();
        if (num>0){
            System.out.println("Number is positive");
        } else if (num<0) {
            System.out.println("Number is negative");
        }
        else {
            System.out.println("Number is Zero");
        }
    }
}
