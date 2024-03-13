package com.september;

import java.util.Scanner;

public class While_Loops1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numbers: ");
        int n=sc.nextInt();
        int i=0;
        while (i<n){
            System.out.println("First n whole numbers: "+i);
            i++;

        }
    }
}
