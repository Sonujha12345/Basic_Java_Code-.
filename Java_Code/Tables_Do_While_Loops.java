package com.september;

import java.util.Scanner;

public class Tables_Do_While_Loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numbers:");
        int n=sc.nextInt();
        int i=1;
        do {
            System.out.println(n+" x "+i+" = "+n*i);
            i++;
        }while (i<=10);
    }
}
