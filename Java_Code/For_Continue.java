package com.september;

public class For_Continue {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            if (i==4){
                continue;
            }else {
                System.out.println(i);
            }
        }
    }
}
