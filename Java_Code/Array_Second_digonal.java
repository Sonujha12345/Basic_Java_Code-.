package com.september;

import java.util.Scanner;

public class Array_Second_digonal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:");
        int m=sc.nextInt();
        System.out.println("Enter the value: ");
        int n=sc.nextInt();
        int[][]a=new int[m][n];
        System.out.println("Enter array element: "+m*n);
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
//                System.out.print(a[i][j]+" ");
                if (j==i){
                    System.out.println("The array secondary diagonal: "+a[i][j]);
                }
            }
//            System.out.println();
        }
    }
}
