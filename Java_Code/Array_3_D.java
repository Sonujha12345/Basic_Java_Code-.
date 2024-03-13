package com.september;

public class Array_3_D {
    public static void main(String[] args) {
            // Declare and initialize a 3D array
            int[][][] threeDArray = new int[3][4][2];

            // Populate the 3D array with values
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 2; k++) {
                        threeDArray[i][j][k] = i+10 + j+10 + k+10;
                    }
                }
            }

            // Print the elements of the 3D array
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 2; k++) {
                        System.out.println("threeDArray[" + i + "][" + j + "][" + k + "] = " + threeDArray[i][j][k]);
                    }
                }
            }
        }
    }


