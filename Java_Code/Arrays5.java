package com.september;

import java.util.Scanner;

public class Arrays5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        double size=sc.nextDouble();
        double []a=new double[(int) size];
        for (double i=0;i<a.length;i++){
            System.out.println("Enter array value: ");
            a[(int) i]=sc.nextDouble();
        }
        for (double e: a){
            System.out.println("The array element: "+e);
        }
        sc.close();
    }
}
