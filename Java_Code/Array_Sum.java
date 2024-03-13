package com.september;

import java.util.Scanner;

public class Array_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:");
        int m=sc.nextInt();
        System.out.println("Enter the value: ");
        int n=sc.nextInt();
        int sum=0;
        int [][]a=new int[m][n];
        System.out.println("Enter array element: "+m*n);
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<a.length;i++){
            for ( int j=0;j<a[i].length;j++){
                sum +=a[i][j];
            }
        }
        System.out.println("The array sum of: "+sum);
    }
}
