package com.september;

import java.util.Scanner;

public class Array_even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value: ");
        int m=sc.nextInt();
        System.out.println("Enter value: ");
        int n=sc.nextInt();
        int [][] a=new int[m][n];
        System.out.println("Enter the marks");
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                if (a[i][j]%2==0){
                    System.out.println("The even array element: "+a[i][j]);
                }
            }
        }
    }
}
