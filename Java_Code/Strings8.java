package com.september;

import java.util.Scanner;

public class Strings8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        String re=reString(s);//method call
        System.out.println(re);
    }
    public static String reString(String str){
        StringBuilder s1=new StringBuilder();//reverse string
        for (int i=str.length()-1;i>=0;i--){
            s1.append(str.charAt(i));
        }
        return s1.toString();
    }
}
