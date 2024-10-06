package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayOrderCheckerTest {

    @Test
    void testAscendingOrderArray() {
        int[] ascendingArray = {1, 2, 3, 4, 5};

        checkArraySorting(ascendingArray, "Ascending Array");
        assertTrue(ArrayOrderChecker.isSorted(ascendingArray), "Array should be sorted in ascending order.");
    }

    @Test
    void testDescendingOrderArray() {
        int[] descendingArray = {5, 4, 3, 2, 1};

        checkArraySorting(descendingArray, "Descending Array");
        assertTrue(ArrayOrderChecker.isSorted(descendingArray), "Array should be sorted in descending order.");
    }

    @Test
    void testUnsortedArray() {
        int[] unsortedArray = {3, 1, 4, 2, 5};

        checkArraySorting(unsortedArray, "Unsorted Array");
        assertFalse(ArrayOrderChecker.isSorted(unsortedArray), "Array should not be sorted.");
    }

    @Test
    void testSingleElementArray() {
        int[] singleElementArray = {7};

        assertTrue(ArrayOrderChecker.isSorted(singleElementArray), "Single element array should be considered sorted.");
    }

    @Test
    void testEmptyArray() {
        int[] emptyArray = {};

        assertTrue(ArrayOrderChecker.isSorted(emptyArray), "Empty array should be considered sorted.");
    }

    private void checkArraySorting(int[] array, String arrayName) {
        boolean isSorted = ArrayOrderChecker.isSorted(array);

        if (isSorted) {
            if (array.length < 2) {
                System.out.println(arrayName + " is sorted: true (Single element or empty)");
            } else if (ArrayOrderChecker.isArrayAscending(array)) {
                System.out.println(arrayName + " is sorted: true (Ascending order)");
            } else {
                System.out.println(arrayName + " is sorted: true (Descending order)");
            }
        } else {
            System.out.println(arrayName + " is sorted: false (Not sorted)");
        }
    }
}
