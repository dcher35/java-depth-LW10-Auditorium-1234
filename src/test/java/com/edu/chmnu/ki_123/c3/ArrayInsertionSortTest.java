package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayInsertionSortTest {

    @Test
    void testInsertionSort() {
        int[] unsortedArray = {5, 2, 0, 1, 3, 8};
        int[] expectedSortedArray = {0, 1, 2, 3, 5, 8};

        ArrayInsertionSort.insertionSort(unsortedArray);
        assertArrayEquals(expectedSortedArray, unsortedArray, "The array should be sorted correctly.");
    }

    @Test
    void testInsertionSortWithEmptyArray() {
        int[] emptyArray = {};
        ArrayInsertionSort.insertionSort(emptyArray);
        assertArrayEquals(new int[]{}, emptyArray, "Empty array should remain unchanged.");
    }

    @Test
    void testInsertionSortWithSingleElementArray() {
        int[] singleElementArray = {7};
        ArrayInsertionSort.insertionSort(singleElementArray);
        assertArrayEquals(new int[]{7}, singleElementArray, "Single element array should remain unchanged.");
    }

    @Test
    void testInsertionSortAlreadySortedArray() {
        int[] alreadySortedArray = {1, 2, 3, 4, 5};
        ArrayInsertionSort.insertionSort(alreadySortedArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, alreadySortedArray, "Already sorted array should remain unchanged.");
    }

    @Test
    void testInsertionSortWithNegativeNumbers() {
        int[] arrayWithNegatives = {3, -1, 2, -5, 4};
        int[] expectedSortedArray = {-5, -1, 2, 3, 4};

        ArrayInsertionSort.insertionSort(arrayWithNegatives);
        assertArrayEquals(expectedSortedArray, arrayWithNegatives, "The array with negative numbers should be sorted correctly.");
    }
}