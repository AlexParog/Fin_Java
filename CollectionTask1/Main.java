package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<Integer> new_array = new ArrayList<>();
        ArrayList<Double> a_List = new ArrayList<>();
        LinkedList<Double> l_List = new LinkedList<>();
        final int N = 1000000;
        final int M = 1000; // при значение 100000 очень долго грузит

        // Задание 1
        for (int i = 0; i < 10; i++) {
            new_array.add(1);
            new_array.add(2);
        }

        //Задание 2
        for (int i = 0; i < N; i++) {
            a_List.add(Math.random());
            l_List.add(Math.random());
        }
        long start_Time = System.currentTimeMillis();
        for (int i = 0; i < M; i++)
            a_List.get((int) (Math.random() * (N - 1)));
        System.out.println(System.currentTimeMillis() - start_Time);

        start_Time = System.currentTimeMillis();
        for (int i = 0; i < M; i++)
            l_List.get((int) (Math.random() * (N - 1)));
        System.out.println(System.currentTimeMillis() - start_Time);

        Collection<Integer> remove_coll = RemoveTheSame.RemoveTheSame(new_array);
        System.out.println("Task № 1");
        System.out.println(remove_coll);
    }
}
