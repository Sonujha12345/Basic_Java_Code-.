package com.september;

import java.util.Scanner;

public class Arrays4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        float size=sc.nextFloat();
        float []a=new float[(int) size];
        for (float i=0;i<a.length;i++){
            System.out.println("Enter array value: "+i);
            a[(int) i]=sc.nextFloat();
        }
        for (float e:a){
            System.out.println("The array element: "+e);
        }
        sc.close();
    }
}
