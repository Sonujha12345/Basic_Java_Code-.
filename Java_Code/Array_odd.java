package com.september;

import java.util.Scanner;

public class Array_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value: ");
        int m=sc.nextInt();
        System.out.println("Enter the value: ");
        int n=sc.nextInt();
        int [][] a=new  int[m][n];
        System.out.println("Enter the element:"+m*n);
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                if (a[i][j]%2==1){
                    System.out.println("The array element odd: "+a[i][j]);
                }
            }

        }
    }
}
