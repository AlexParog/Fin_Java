package com.company;

public class theEquation {
    public static double func(double x) {
        return 200 * x - 23;
    }

    public static double decision(double start, double end) {

        double x = start + (end - start) / 2; //рабиваем отрезок на две части
        if (end - start <= 0.001) { //точность, которая в условии задачи
            return start;
        }
        if (func(start) * func(x) > 0) { //правая сторона
            return decision(x, end);
        } else {
            //левая сторона
            return decision(start, x);
        }
    }
}
