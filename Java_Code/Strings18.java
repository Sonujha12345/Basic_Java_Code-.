package com.september;

public class Strings18 {
    public static void main(String[]args) {
        String a="program";
        char[]ch=new char[256];
        for(int i=0;i<a.length();i++) {
            ch[a.charAt(i)]++;
        }
        for(int i=0;i<a.length();i++) {
            if(ch[a.charAt(i)]==1) {
                System.out.println(a.charAt(i));
                break;
            }

        }
    }
}
