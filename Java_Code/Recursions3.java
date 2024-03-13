package com.september;

import java.util.Scanner;

public class Recursions3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=sc.nextInt();
        mul(a,1);
    }
    static void mul(int n,int i){
        if (i>10){
            return;
        }
        System.out.println("Multiplication tables: "+n+"*"+i+"="+(n*i));
        mul(n,i+1);
    }
}
