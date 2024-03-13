package com.september;

public class Stars16 {
    public static void main(String[] args) {
        for (int i=1;i<=26;i++){
            for (int j=1;j<=26;j++){
                System.out.print((char) (j+64)+" ");
            }
            System.out.println();
        }
    }
}
