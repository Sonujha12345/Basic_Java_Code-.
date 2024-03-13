package com.september;

import java.util.Scanner;

public class Array_2_D_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter class value: ");
        float m=sc.nextFloat();
        System.out.println("Enter student:");
        float n=sc.nextFloat();
        float [][]a=new float[(int) m][(int) n];
        for (float i=0;i<a.length;i++){
            for (float j = 0; j<a[(int) i].length; j++){
                System.out.println("Enter marks");
                a[(int) i][(int) j]=sc.nextFloat();
            }
        }
        System.out.println("The total marks: ");
        for (float i=0;i<a.length;i++){
            for (float j = 0; j<a[(int) i].length; j++){
                System.out.println(a[(int) i][(int) j]);
            }
        }
    }

}
