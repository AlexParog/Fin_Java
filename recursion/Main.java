package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Первое задание");
        System.out.println(recursionTask1(20));

        System.out.println("");

        System.out.println("Второе задание");
        double[] array = getRandomArray(100000000);
        Arrays.sort(array);
        long startTime = System.nanoTime();
        System.out.println(Binary.regular_search(array, 1));
        double res1 = ((double) (System.nanoTime() - startTime) / 1_000_000_000);
        System.out.println("Времени затрачено на перебор: " + res1);

        startTime = System.nanoTime();
        System.out.println(Binary.binarySearchRecursively(array, 1, 0, array.length));
        double res2 = ((double) (System.nanoTime() - startTime) / 1_000_000_000);
        System.out.println("Времени затрачено на двоичный поиск: " + res2);
        System.out.println("");

        System.out.println("Третье задание");
        System.out.println("Решение уравнения: "+theEquation.decision(0,10));
    }

    public static String recursionTask1(int num) {
        if (num == 1) return "1";
        else return recursionTask1(num - 1) + " " + num;
    }

    public static double[] getRandomArray(int size) {
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = Math.random();
        }
        return array;
    }


}
