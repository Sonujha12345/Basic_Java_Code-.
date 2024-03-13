package com.september;

import java.util.Scanner;

public class Arrays16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size=sc.nextInt();
        int [] a=new int[size];
        for (int i=0;i<a.length;i++){
            System.out.println("Array elements: "+i);
            a[i]=sc.nextInt();
        }
        System.out.println("Compare element");
        int ele=sc.nextInt();
        boolean flag=false;
        for (int i=0;i<a.length;i++) {
            if (ele == a[i]) {
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
            if (flag == true){
                System.out.println("The element present..");
            }else {
                System.out.println("The element not present:..");
            }
    }
}
