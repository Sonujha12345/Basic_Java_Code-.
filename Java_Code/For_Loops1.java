package com.september;

import java.util.Scanner;

public class For_Loops1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numbers: ");
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("First n whole numbers: "+i);
        }
    }
}
