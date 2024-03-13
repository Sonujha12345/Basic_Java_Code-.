package com.september;

public class Method2 {
    public static int add(){
        int a=100;
        int b=200;
        int c=a+b;
        return c;
    }
    public static void main(String[] args) {
//        int a=100;
//        int b=200;
       int c= add();
        System.out.println("The sum of a and b is: "+c);
    }
}
