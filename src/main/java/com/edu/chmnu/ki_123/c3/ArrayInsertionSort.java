//Реалізувати алгоритм сортування вставками.
package com.edu.chmnu.ki_123.c3;

import java.util.Arrays;

public class ArrayInsertionSort {
    public static void main(String[] args) {
        int[] arraySort = {5, 2, 0, 1, 3, 8};

        System.out.println("Array: " + Arrays.toString(arraySort));
        insertionSort(arraySort);
        System.out.println("Sorted array: " + Arrays.toString(arraySort));
    }

    public static void insertionSort(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Array is null or empty");
            return;
        } else if (array.length == 1) {
            System.out.println("Array is single element");
            return;
        }

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}