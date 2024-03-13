package com.september;

public class SpiralMatrix {
        public static void main(String[] args) {
            int n = 4; // Change this to the desired size of the matrix
            int[][] spiralMatrix = generateSpiralMatrix(n);

            // Print the generated spiral matrix
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(spiralMatrix[i][j] + "\t");
                }
                System.out.println();
            }
        }

        static int[][] generateSpiralMatrix(int n) {
            int[][] matrix = new int[n][n];

            int num = 1;
            int rowStart = 0, rowEnd = n - 1;
            int colStart = 0, colEnd = n - 1;

            while (num <= n * n) {
                // Traverse right
                for (int i = colStart; i <= colEnd; i++) {
                    matrix[rowStart][i] = num++;
                }
                rowStart++;

                // Traverse down
                for (int i = rowStart; i <= rowEnd; i++) {
                    matrix[i][colEnd] = num++;
                }
                colEnd--;

                // Traverse left
                for (int i = colEnd; i >= colStart; i--) {
                    matrix[rowEnd][i] = num++;
                }
                rowEnd--;

                // Traverse up
                for (int i = rowEnd; i >= rowStart; i--) {
                    matrix[i][colStart] = num++;
                }
                colStart++;
            }

            return matrix;
        }
    }


