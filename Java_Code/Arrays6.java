package com.september;

import java.util.Scanner;

public class Arrays6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int size=sc.nextInt();
        char[]a=new char[size];
        for (char i=0;i<a.length;i++){
            System.out.println("Enter array value: "+i);
            a[i]=sc.next().charAt(0);
        }
        for (char e: a) {
            System.out.println("The array element: " + e);
        }
        sc.close();
    }
}
