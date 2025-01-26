package com.missingNoCSort;

import java.util.Arrays;
public class missingNoCSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 2};
        System.out.println(missingNoCSort(arr));
    }

    public static int missingNoCSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (correct < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return arr.length; // Return arr.length if no missing element is found.
    }

    // Fixed the method signature, making it static void instead of void static
    // Also, corrected the typo "lenght" to "length"
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

