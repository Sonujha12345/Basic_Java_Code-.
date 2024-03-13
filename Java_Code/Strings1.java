package com.september;

public class Strings1 {
    public static void main(String[] args) {
        String s1="sonu";
        String s2="sonu";
        String s3=new String("sonu");
        String s4=new String("sonu");
        s2=s3;
        s1=s2;
        System.out.println("  "+s2.equals(s3));
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);
        System.out.println(s2.equals(s4));
        System.out.println(s3.equals(s4));
        System.out.println(s2==s3);
        System.out.println(s1.equals(s2));
        String a="1234";
        String b="56789";
        b=a;
        System.out.println(a);
        System.out.println(b);

    }
}
