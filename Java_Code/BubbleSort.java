package com.september;

public class BubbleSort {
        public static void main(String[] args) {
            int[] array = {64, 34, 25, 12, 22, 11, 90};

            System.out.println("Original Array:");
            printArray(array);

            bubbleSort(array);

            System.out.println("\nSorted Array:");
            printArray(array);
        }

        static void bubbleSort(int[] array) {
            int n = array.length;
            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j < n-i-1; j++) {
                    if (array[j] > array[j+1]) {
                        // swap temp and arr[i]
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
        }

        static void printArray(int[] array) {
            for (int value : array) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
}



