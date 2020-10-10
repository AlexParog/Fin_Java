package com.company;

public class Main {

    public static void main(String[] args) {
        int[] values = { 1, 2, 3, 5 };
        int[] weights = { 2, 3, 4, 6 };
        ReturnRandom returnRandom = new ReturnRandom(values, weights);
        returnRandom.GetRandom();
    }
}
