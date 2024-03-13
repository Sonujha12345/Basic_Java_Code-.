package com.september;

public class Arrays10 {
    public static void main(String[] args) {
        char [] a={'A','B','C','D','E','F'};
        for (int i=0;i<a.length;i++){
            if (i%2==1){
                System.out.println(a[i]);
            }
        }
    }
}
