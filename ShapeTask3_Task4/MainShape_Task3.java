package com.company;

import java.util.Scanner;

public class MainShape_Task3 {

    public static void main(String[] args) {
        Box box = new Box(700);
        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;

        while (true) {
            System.out.println("Введите форму тела: шар, цилиндр, пирамида");
            String string = scanner.next();
            switch (string) {
                case "шар":
                    System.out.println("Введите радиус");
                    double radius = scanner.nextDouble();
                    Ball ball = new Ball(radius);
                    isTrue = box.add(ball);
                    break;
                case "пирамида":
                    System.out.println("Введите площадь");
                    double s = scanner.nextDouble();
                    System.out.println("Введите высоту");
                    double height = scanner.nextDouble();
                    Pyramid pyramid = new Pyramid(s, height);
                    isTrue =  box.add(pyramid);
                    break;
                case "цилиндр":
                    System.out.println("Введите радиус");
                    radius = scanner.nextDouble();
                    System.out.println("Введите высоту");
                    height = scanner.nextDouble();
                    Cylinder cylinder = new Cylinder(radius, height);
                    isTrue =  box.add(cylinder);
                    break;
                default:
                    break;
            }

            if (!isTrue){
                System.out.println("Коробка переполнена");
                break;
            }
        }
    }
}
