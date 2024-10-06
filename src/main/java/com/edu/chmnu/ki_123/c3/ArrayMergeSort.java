/*Використовуючи реалізацію п. 2, реалізувати алгоритм сортування
злиттям. Написати тести для цього алгоритму.*/
package com.edu.chmnu.ki_123.c3;

import java.util.Arrays;

public class ArrayMergeSort {
    public static void main(String[] args) {
        int[] arrayToSort = {5, 2, 0, 1, 3, 8};

        System.out.println("Array: " + Arrays.toString(arrayToSort));
        mergeSort(arrayToSort);
        System.out.println("Sorted array: " + Arrays.toString(arrayToSort));
    }

    public static void mergeSort(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Array is null or empty");
            return;
        } else if (array.length == 1) {
            System.out.println("Array is single element");
            return;
        }

        mergeSort(array, 0, array.length - 1);
    }

    private static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        System.arraycopy(array, left, leftArray, 0, n1);
        System.arraycopy(array, mid + 1, rightArray, 0, n2);

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        while (i < n1) {
            array[k++] = leftArray[i++];
        }

        while (j < n2) {
            array[k++] = rightArray[j++];
        }
    }
}
