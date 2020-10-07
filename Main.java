package com.company;

public class Main {

    public static void main(String[] args) {
        double x1, y1, z1;
        x1 = 1;
        y1 = 6;
        z1 = 8;


        Body_EXVector v_numone = new Body_EXVector(x1, y1, z1);
        System.out.println("Длина вектора: " + Math.round(v_numone.V_Length(1, 6, 8)));
        System.out.println("Скалярное произведение векторов: " + v_numone.Mul_Scalar(1, 2, 3));
        System.out.printf("Векторное произведение: (%f, %f, %f) \n", v_numone.Vec_to_vec1(2, 3),
                v_numone.Vec_to_vec2(4, 3), v_numone.Vec_to_vec3(4, 2));
        System.out.println("Угол между векторами равен: " + v_numone.AngleVec(10, 16));
        System.out.printf("Метод суммы: (%f, %f, %f) \n", v_numone.Vec_sum_vec1(1),
                v_numone.Vec_sum_vec2(2), v_numone.Vec_sum_vec3(5));
        System.out.printf("Метод разности: (%f, %f, %f) \n", v_numone.Vec_sub_vec1(1),
                v_numone.Vec_sub_vec2(2), v_numone.Vec_sub_vec3(5));

    }
}
