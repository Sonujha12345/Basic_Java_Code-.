package com.september;

import java.util.Scanner;

public class Practs4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number one :");
        int a=sc.nextInt();
        System.out.println("Enter a number two :");
        int b=sc.nextInt();
        int result=a-b;
        if (result>0){
        System.out.println("The result is positive..");
        }else {
            System.out.println("The result is not positive");
        }
        System.out.println("The result is: "+result);
    }
}
