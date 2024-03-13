package com.september;

import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        short size=sc.nextShort();
        short []a=new short[size];
        for (short i=0;i<a.length;i++){
            System.out.println("Enter array value: "+i);
            a[i]=sc.nextShort();
        }
        for (short e:a){
            System.out.println("The array element: "+e);
        }
        sc.close();
    }
}
