package com.september;

import java.util.Scanner;

public class Do_While_Loops1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numbers: ");
        int n=sc.nextInt();
        int i=0;
        do {
            System.out.println("First n whole numbers: "+i);
            i++;
        }while (i<n);
    }
}
