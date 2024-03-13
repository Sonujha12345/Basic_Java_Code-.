package com.september;

import java.util.Scanner;

public class Practs10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age :");
        int age=sc.nextInt();
        sc.close();
        if (age>=21){
            System.out.println("Marriage");
        }else {
            System.out.println("Not marriage");
        }
    }
}
