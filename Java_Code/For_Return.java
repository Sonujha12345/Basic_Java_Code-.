package com.september;

public class For_Return {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++) {
            if (i == 5) {
                return;
            } else {
                System.out.println(i);
            }
        }
    }
}
