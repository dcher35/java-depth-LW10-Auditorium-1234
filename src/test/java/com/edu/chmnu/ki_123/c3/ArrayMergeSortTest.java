package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayMergeSortTest {
    @Test
    public void testMergeSort() {
        int[] arrayToSort1 = {5, 2, 0, 1, 3, 8};
        int[] expected1 = {0, 1, 2, 3, 5, 8};
        ArrayMergeSort.mergeSort(arrayToSort1);
        assertArrayEquals(expected1, arrayToSort1);

        int[] arrayToSort2 = {1, 1, 1, 1};
        int[] expected2 = {1, 1, 1, 1};
        ArrayMergeSort.mergeSort(arrayToSort2);
        assertArrayEquals(expected2, arrayToSort2);

        int[] arrayToSort3 = {10};
        int[] expected3 = {10};
        ArrayMergeSort.mergeSort(arrayToSort3);
        assertArrayEquals(expected3, arrayToSort3);

        int[] arrayToSort4 = {};
        int[] expected4 = {};
        ArrayMergeSort.mergeSort(arrayToSort4);
        assertArrayEquals(expected4, arrayToSort4);

        int[] arrayToSort5 = {-5, -1, -3, -2, 0};
        int[] expected5 = {-5, -3, -2, -1, 0};
        ArrayMergeSort.mergeSort(arrayToSort5);
        assertArrayEquals(expected5, arrayToSort5);
    }
}