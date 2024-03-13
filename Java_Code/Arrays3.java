package com.september;

import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        long size=sc.nextLong();
        long[]a=new long[(int) size];
        for (long i=0;i<a.length;i++){
            System.out.println("Enter array value: "+i);
            a[(int) i]=sc.nextLong();
        }
        for (long e:a){
            System.out.println("The array element: "+e);
        }
        sc.close();
    }
}
