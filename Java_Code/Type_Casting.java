package com.september;
public class Type_Casting {
    public static void main(String[] args) {
        int a2=23;
        long l=a2;   //implicit type casting
        System.out.println(l);
        long a=109087;
       int b=(int) a;  //exclusivity type casting
        short a1= (short) a;
        byte b1=(byte) a;
        float f= a;
        double d=a;
        char c=(char) a;
        System.out.println(a1);
        System.out.println(b);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b1);
    }
}
