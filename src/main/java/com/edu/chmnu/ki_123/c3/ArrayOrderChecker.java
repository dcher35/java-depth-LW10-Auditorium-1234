//Написати метод, який визначає впорядкованість масиву, не важливо –
// за зростанням чи спаданням. Важливо, що прохід по масиву повинен
// виконуватися один раз.
package com.edu.chmnu.ki_123.c3;

public class ArrayOrderChecker {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {5, 4, 3, 2, 1};
        int[] thirdArray = {3, 1, 4, 2, 5};
        int[] singleArray = {7};
        int[] emptyArray = {};

        checkArraySorting(firstArray, "First array");
        checkArraySorting(secondArray, "Second array");
        checkArraySorting(thirdArray, "Third array");
        checkArraySorting(singleArray, "Single array");
        checkArraySorting(emptyArray, "Empty array");
    }

    public static void checkArraySorting(int[] array, String arrayName) {
        boolean isSorted = isSorted(array);
        if (isSorted) {
            if (array.length < 2) {
                System.out.println(arrayName + " is sorted: true (Single element or empty)");
            } else if (isArrayAscending(array)) {
                System.out.println(arrayName + " is sorted: true (Ascending order)");
            } else {
                System.out.println(arrayName + " is sorted: true (Descending order)");
            }
        } else {
            System.out.println(arrayName + " is sorted: false (Not sorted)");
        }
    }

    public static boolean isSorted(int[] array) {
        if (array.length < 2) return true;

        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                descending = false;
            } else if (array[i] < array[i + 1]) {
                ascending = false;
            }
        }

        return ascending || descending;
    }

    public static boolean isArrayAscending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}