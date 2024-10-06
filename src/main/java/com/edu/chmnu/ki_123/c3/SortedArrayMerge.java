/*Маємо два відсортовані масиви. Необхідно утворити третій масив із
двох даних масивів, який теж буде відсортований. Алгоритм повинен
виконувати не більше одного проходу по обом масивам.*/
package com.edu.chmnu.ki_123.c3;

import java.util.Arrays;

public class SortedArrayMerge {
    public static void main(String[] args) {
        int[] firstArray = {1, 3, 5, 7};
        int[] secondArray = {2, 4, 6, 8};

        int[] mergedArray = mergeSortedArrays(firstArray, secondArray);

        System.out.println("Merged sorted array: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        if (array1 == null) return array2;
        if (array2 == null) return array1;

        int[] mergedArray = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

        while (i < array1.length) {
            mergedArray[k++] = array1[i++];
        }

        while (j < array2.length) {
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;
    }
}