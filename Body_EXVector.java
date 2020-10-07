package com.company;


public class Body_EXVector {
    double x1, y1, z1;

    Body_EXVector(double x1, double y1, double z1) {
        this.x1 = x1;
        this.y1 = y1;
        this.z1 = z1;
    }

    public double V_Length(double x1, double y1, double z1) {
        return Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2) + Math.pow(z1, 2));
    }

    public double Mul_Scalar(double x1, double y1, double z1) {
        double x2, y2, z2;
        x2 = 2;
        y2 = 5;
        z2 = 1;
        return x1 * x2 + y1 * y2 + z1 * z2;
    }

    public double Vec_to_vec1(double y1, double z1) {
        double y2, z2;
        y2 = 5;
        z2 = 1;
        return y1 * z2 - z1 * y2;
    }

    public double Vec_to_vec2(double x1, double z1) {
        double x2, z2;
        x2 = 2;
        z2 = 1;
        return z1 * x2 - x1 * z2;
    }

    public double Vec_to_vec3(double x1, double y1) {
        double x2, y2;
        x2 = 2;
        y2 = 5;
        return x1 * y2 - y1 * x2;
    }

    public double AngleVec(double x1, double y1) {
        double x2, y2;
        x2 = 5;
        y2 = 4;
        return (x1 * x2 + y1 * y2) / Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2))
                * Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
    }

    public double Vec_sum_vec1(double x1) {
        double x2 = 9;
        return x1 + x2;

    }

    public double Vec_sum_vec2(double y1) {
        double y2 = -2;
        return y1 + y2;

    }

    public double Vec_sum_vec3(double z1) {
        double z2 = 10;
        return z1 + z2;

    }

    public double Vec_sub_vec1(double x1) {
        double x2 = 7;
        return x1 - x2;

    }

    public double Vec_sub_vec2(double y1) {
        double y2 = 2;
        return y1 - y2;

    }

    public double Vec_sub_vec3(double z1) {
        double z2 = 1;
        return z1 - z2;

    }
}
