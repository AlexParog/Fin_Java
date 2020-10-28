package com.company;

public class Main {
        public static void main(String[] args) {
            Integer[] array1 = {1, 3, 6, 12, 7};
            ArrayIterator<Integer> arrIt1 = new ArrayIterator<>(array1);

            System.out.println(arrIt1.next());
        }
}