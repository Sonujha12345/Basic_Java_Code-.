package com.september;

import java.util.Scanner;

public class Array_2_D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the class value: ");
        int m=sc.nextInt();
        System.out.println("Enter the marks of student:");
        int n=sc.nextInt();
        int [][] marks=new int[m][n];
        for (int i=0;i<marks.length;i++){
            for (int j=0;j<marks[i].length;j++){
                System.out.println("Enter array marks: "+marks[i][j]+" : ");
                marks[i][j]=sc.nextInt();
            }
        }
        System.out.println("The total marks of student: ");
        for (int i=0;i<marks.length;i++){
            for (int j=0;j< marks[i].length;j++){
                System.out.println(marks[i][j]);
            }
        }
    }
}
