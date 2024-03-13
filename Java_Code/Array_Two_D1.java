package com.september;

public class Array_Two_D1 {
    public static void main(String[] args) {
        int[][] marks=new int[2][5];
        marks[0][0]=85;
        marks[0][1]=90;
        marks[0][2]=95;
        marks[0][3]=80;
        marks[0][4]=98;
        marks[1][0]=70;
        marks[1][1]=75;
        marks[1][2]=88;
        marks[1][3]=97;
        marks[1][4]=79;
        for (int i=0;i< marks.length;i++){
            for (int j=0;j<marks[i].length;j++){
                System.out.println("The marks of student:"+marks[i][j]);
            }
        }
    }
}
