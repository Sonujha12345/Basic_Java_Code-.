package com.september;

import java.util.Scanner;

public class Even_For_Loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numbers: ");
        int n=sc.nextInt();
        for (int i = 1; i<=n; i++){
            System.out.println("The even numbers: "+2*i);
        }
    }
}
