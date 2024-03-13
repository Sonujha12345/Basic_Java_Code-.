package com.september;

import java.util.Scanner;

public class Arrays7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int size=sc.nextInt();
        String []a=new String[size];
        for (int i =0; i<a.length; i++){
            System.out.println("Enter array value "+i+":");
            a[i]=sc.next();
        }
        for (String e: a){
            System.out.println("The array of element: "+e);
        }
        sc.close();
    }
}
