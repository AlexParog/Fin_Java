package com.company;

import java.util.Arrays;

public class Matrix_1 {
    public static void main(String[] args) {
        int[][] mat1 = {
                {1, 2},
                {3, 4}
        };

        int[][] mat2 = {
                {4, 5},
                {6, 7}
        };

        System.out.println("Матрица 1");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {

            }
            System.out.println(Arrays.toString(mat1[i]));
        }
        System.out.println("Матрица 2");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {

            }
            System.out.println(Arrays.toString(mat2[i]));
        }

        Func_Sum(mat1, mat2);
        Func_Subtraction(mat1, mat2);
        Func_Mul(mat1, mat2);
        Func_Trans1(mat1);
        Func_Trans2(mat2);
        Func_Degree1(mat1);
        Func_Degree2(mat2);
    }

    public static int[][] Func_Sum(int[][] mat1, int[][] mat2) {
        int[][] result = {
                {mat1[0][0] + mat2[0][0], mat1[0][1] + mat2[0][1]},
                {mat1[1][0] + mat2[1][0], mat1[1][1] + mat2[1][1]}
        };
        System.out.println("Сумма матриц");

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {

            }
            System.out.println(Arrays.toString(result[i]));
        }
        return result;
    }

    public static int[][] Func_Subtraction(int[][] mat1, int[][] mat2) {
        int[][] result = {
                {mat1[0][0] - mat2[0][0], mat1[0][1] - mat2[0][1]},
                {mat1[1][0] - mat2[1][0], mat1[1][1] - mat2[1][1]}
        };
        System.out.println("Разность матриц");

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {

            }
            System.out.println(Arrays.toString(result[i]));
        }
        return result;
    }

    public static int[][] Func_Mul(int[][] mat1, int[][] mat2) {
        int mat1ColLength = mat1[0].length;
        int mat2RowLength = mat2.length;
        if (mat1ColLength == mat2RowLength) {
            int[][] result = {
                    {mat1[0][0]*mat2[0][0] + mat1[0][1]*mat2[1][0], mat1[0][0]*mat2[0][1] + mat1[0][1]*mat2[1][1]},
                    {mat1[1][0]*mat2[0][0] + mat1[1][1]*mat2[1][0], mat1[1][0]* mat2[0][1] + mat1[1][1]*mat2[1][1]}
            };
            System.out.println("Произведение матриц");

            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {

                }
                System.out.println(Arrays.toString(result[i]));
            }
            return result;
        } else
            System.out.println("Количество строк не равно количеству столбцов!");
        int[][] result = {
                    {0, 0},
                    {0, 0}
            };
        return result;
    }

    public static  int[][] Func_Trans1(int[][] mat1){
        int[][] result1 = {
                {mat1[0][0], mat1[1][0]},
                {mat1[0][1], mat1[1][1]}
        };
        System.out.println("Транспонированная матрица 1");

        for (int i = 0; i < result1.length; i++) {
            for (int j = 0; j < result1[i].length; j++) {

            }
            System.out.println(Arrays.toString(result1[i]));
        }
        return result1;
    }

    public static  int[][] Func_Trans2(int[][] mat2){
        int[][] result2 = {
                {mat2[0][0], mat2[1][0]},
                {mat2[0][1], mat2[1][1]}
        };
        System.out.println("Транспонированная матрица 2");

        for (int i = 0; i < result2.length; i++) {
            for (int j = 0; j < result2[i].length; j++) {

            }
            System.out.println(Arrays.toString(result2[i]));
        }
        return result2;
    }

    public static int[][] Func_Degree1(int[][] mat1){
        int[][] result1 = {
                {mat1[0][0] * mat1[0][0], mat1[0][1] * mat1[0][1]},
                {mat1[1][0] * mat1[1][0], mat1[1][1] * mat1[1][1]}
        };
        System.out.println("Матрица 1 в степени 2");

        for (int i = 0; i < result1.length; i++) {
            for (int j = 0; j < result1[i].length; j++) {

            }
            System.out.println(Arrays.toString(result1[i]));
        }
        return result1;
    }

    public static int[][] Func_Degree2(int[][] mat2){
        int[][] result2 = {
                {mat2[0][0] * mat2[0][0], mat2[0][1] * mat2[0][1]},
                {mat2[1][0] * mat2[1][0], mat2[1][1] * mat2[1][1]}
        };
        System.out.println("Матрица 2 в степени 2");

        for (int i = 0; i < result2.length; i++) {
            for (int j = 0; j < result2[i].length; j++) {

            }
            System.out.println(Arrays.toString(result2[i]));
        }
        return result2;
    }
}
