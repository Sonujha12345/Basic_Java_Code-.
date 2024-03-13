package com.september;

public class Recursions1 {
    public static void main(String[] args) {
        display(5);
    }
    static void display(int a){
        System.out.println("Hello");
//        a++;
//        if(a<=5){
//
        a--;
        if (a>=1){
            display(a);
        }
    }
}
