package com.september;

import java.util.Scanner;

public class Strings9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        String mo=moString(s);
        System.out.println(mo);
    }
    public static String moString(String str){
        StringBuilder s1=new StringBuilder();
        for (int i=0;i< str.length();i++){
            char ch=str.charAt(i);
            if (ch==' '){
               s1.append("99") ;
            }else {
                s1.append(ch);
            }
        }
        return s1.toString();
    }
}
