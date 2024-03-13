package com.september;

public class Recursions {
    public static void main(String[] args) {
        display();
    }
    static  void display(){
        System.out.println("Recursion");
        display();
    }
}
