package com.september;

public class Arrays14 {
    public static void main(String[] args) {
        int [] a={12,14,15,18,21,28};
        for (int i=0;i<a.length;i++){
            if ((a[i]%6==0)||(a[i]%7==0)){
                System.out.println(a[i]);
            }
        }
    }
}
