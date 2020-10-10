package com.company;

import java.util.ArrayList;

public class Box extends Shape {
    private double now;
    private ArrayList<Shape> box = new ArrayList<Shape>();

    public Box(double now) {
        super(now);
        this.now = now;
    }

    public boolean add(Shape shape) {
        if (now >= shape.getVolume()) {
            box.add(shape);
            now -= shape.getVolume();
            System.out.println("Осталось места: " + now);
            return true;

        } else return false;

    }
}
