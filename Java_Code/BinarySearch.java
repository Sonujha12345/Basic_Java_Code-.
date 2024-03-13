package com.september;

public class BinarySearch {
        public static void main(String[] args) {
            // Sorted array
            int[] array = {30, 44, 55, 65, 70, 80, 90, 100};

            // Element to search for
            int target = 900;

            // Perform binary search
            int result = binarySearch(array, target);

            // Display the result
            if (result != -1) {
                System.out.println("Element " + target + " found at index " + result);
            } else {
                System.out.println("Element " + target + " not found in the array");
            }
        }

        // Binary search algorithm
        private static int binarySearch(int[] array, int target) {
            int low = 0;
            int high = array.length - 1;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (array[mid] == target) {
                    return mid; // Target found
                } else if (target < array[mid]) {
                    high = mid - 1; // Search in the left half
                } else {
                    low = mid + 1; // Search in the right half
                }
            }

            return -1; // Target not found
        }
    }


