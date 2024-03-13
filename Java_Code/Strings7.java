package com.september;

import java.util.Scanner;

public class Strings7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        String s1="";
//        The remove duplicates string:
        for (int i=0;i<=s.length()-1;i++){
            if (!(s1.contains(s.charAt(i)+""))){
                s1=s1+s.charAt(i);
            }
        }
        System.out.println(s1);
    }
}
