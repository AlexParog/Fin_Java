package com.company;

import java.util.concurrent.TimeUnit;

public class Binary {
    public static double regular_search(double[] array, double key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key)
                return i;
        }
        return -1;
    }

    public static int binarySearchRecursively
            (double[] sortedArray, double key, int low, int high) {
        //поиск в пределах [low;high]
        int middle = (low + high) / 2; // середина

        if (high <= low) { // нечего делить
            return -1;
        }

        if (key == sortedArray[middle]) { // если нашёлся
            return middle;
        } else if (key < sortedArray[middle]) { // левая половина
            return binarySearchRecursively(
                    sortedArray, key, low, middle - 1);
        } else {
            return binarySearchRecursively( // правая половина
                    sortedArray, key, middle + 1, high);
        }
    }
}
