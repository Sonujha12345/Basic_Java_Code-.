package com.september;

import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a array size: ");
        byte size=sc.nextByte();
        byte[]a=new byte[size];
        for (byte i=0;i<a.length;i++){
            System.out.println("Enter array value: "+i);
            a[i]=sc.nextByte();
        }
        for (byte e:a){
            System.out.println("The array elements: " + e);
        }
        sc.close();
    }
}
