package com.september;

public class LinearSearch {
        public static int linearSearch(int[] array, int target) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == target) {
                    return i; // Target found, return the index
                }
            }
            return -1; // Target not found
        }

        public static void main(String[] args) {
            int[] array = {2, 5, 8, 12, 16, 23, 38, 42, 50};
            int target = 16;

            int result = linearSearch(array, target);

            if (result != -1) {
                System.out.println("Target found at index: " + result);
            } else {
                System.out.println("Target not found in the array.");
            }
        }
    }


