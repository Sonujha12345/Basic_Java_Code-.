package com.september;

public class Stars8 {
    public static void main(String[] args) {

        for (int i=1;i<=11;i++){
            for (int j=1;j<=11;j++){
                if (i==1&&j!=1&&j!=11||j==1&&i!=1&&i!=11||i==11&&j!=1&&j!=11||j==11&&i!=1&&i!=11){
                    System.out.print("@");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
