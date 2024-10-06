package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortedArrayMergeTest {

    @Test
    public void testMergeSortedArrays() {
        // Тест 1: Злиття двох стандартних відсортованих масивів
        int[] firstArray = {1, 3, 5, 7};
        int[] secondArray = {2, 4, 6, 8};
        int[] expected1 = {1, 2, 3, 4, 5, 6, 7, 8};

        assertArrayEquals(expected1, SortedArrayMerge.mergeSortedArrays(firstArray, secondArray));

        // Тест 2: Злиття двох масивів з однаковими значеннями
        int[] firstArray2 = {1, 1, 1};
        int[] secondArray2 = {1, 1, 1};
        int[] expected2 = {1, 1, 1, 1, 1, 1};

        assertArrayEquals(expected2, SortedArrayMerge.mergeSortedArrays(firstArray2, secondArray2));

        // Тест 3: Злиття одного порожнього масиву з непорожнім
        int[] firstArray3 = {};
        int[] secondArray3 = {2, 4, 6};
        int[] expected3 = {2, 4, 6};

        assertArrayEquals(expected3, SortedArrayMerge.mergeSortedArrays(firstArray3, secondArray3));

        // Тест 4: Злиття двох порожніх масивів
        int[] firstArray4 = {};
        int[] secondArray4 = {};
        int[] expected4 = {};

        assertArrayEquals(expected4, SortedArrayMerge.mergeSortedArrays(firstArray4, secondArray4));

        // Тест 5: Злиття масивів з однаковими значеннями та різною довжиною
        int[] firstArray5 = {1, 2, 3};
        int[] secondArray5 = {1, 2, 2, 3};
        int[] expected5 = {1, 1, 2, 2, 2, 3, 3};

        assertArrayEquals(expected5, SortedArrayMerge.mergeSortedArrays(firstArray5, secondArray5));
    }
}