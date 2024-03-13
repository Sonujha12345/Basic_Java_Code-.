package com.september;

import java.util.Scanner;

public class Even_Do_While_Loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numbers: ");
        int n=sc.nextInt();
        int i=1;
        do {
            System.out.println("The even numbers: "+2*i);
            i++;
        }while (i<=n);
    }
}
