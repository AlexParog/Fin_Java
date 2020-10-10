package com.company;

public class SolidOfRevolution extends Shape {
    private double radius;

    public SolidOfRevolution(double radius, double volume){
        super(volume);
        this.radius = radius;
        System.out.println("Объем тела: "+volume);

    }
}
