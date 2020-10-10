package com.company;

public class ReturnRandom {
    private int[] n_array;

    public ReturnRandom(int[] values, int[] weights) {
        int sum = 0;
        for (int i : weights) {
            sum += i;
        }
        n_array = new int[sum];
        int chet = 0;
        for (int i = 0; i < weights.length; i++) {
            for (int j = 0; j < weights[i]; j++) {
                n_array[chet] = values[i];
                System.out.print(n_array[chet] + " ");
                chet += 1;
            }
        }
    }

    public int GetRandom() {
        double random = (Math.random() * (n_array.length - 1));
        System.out.println("");
        System.out.println("Рандомное значение: " + n_array[(int) random]);
        return n_array[(int) random];
    }
}
