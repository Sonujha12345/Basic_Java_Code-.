package com.september;

import java.util.Scanner;

public class Arrays_3_D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value:");
        int m=sc.nextInt();
        System.out.println("Enter value:");
        int n=sc.nextInt();
        System.out.println("Enter value:");
        int o=sc.nextInt();
        int [][][] a=new int[m][n][o];
        System.out.println("Enter the student marks: "+m*n*o+":");
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++) {
                for (int k=0;k<a[i][j].length;k++){
                    a[i][j][k]=sc.nextInt();

                }
            }
        }
        System.out.println("The total array:");
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                for (int k=0;k<a[i][j].length;k++){
                    System.out.println(a[i][j][k]);
                }
            }
        }
    }
}
