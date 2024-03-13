package com.september;

public class Array_Two_D {
    public static void main(String[] args) {
        int[][]a=new int[2][5];
        a[0][0]=20;
        a[0][1]=30;
        a[0][2]=40;
        a[0][3]=50;
        a[0][4]=60;
        a[1][0]=100;
        a[1][1]=200;
        a[1][2]=300;
        a[1][3]=400;
        a[1][4]=500;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.println("The 2-D Array Element: "+a[i][j]);
            }

        }

    }
}
