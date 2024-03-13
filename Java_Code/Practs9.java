package com.september;

import java.util.Scanner;

public class Practs9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age :");
        int age =sc.nextInt();
        sc.close();
        if (age>=18&&age<=100){
            System.out.println("Eligible to vote.....");
        }else {
            System.out.println("Not eligible to vote....");
        }
    }
}
