package com.september;

public class Stars14 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                if (i==j){
                    System.out.print(j*10+" ");
                }else {
                    System.out.print(j*10+" * ");
                }
            }
            System.out.println();
        }
    }
}
