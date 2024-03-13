package com.september;

public class Arrays13 {
    public static void main(String[] args) {
        int [] a={12,2,18,24,36};
        for (int i=0;i<a.length;i++){
            if ((a[i]%3==0)&&(a[i]%4==0)){
                System.out.println(a[i]);
            }
        }
    }
}
