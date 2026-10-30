package org.example;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle(new RationalFraction(0, 1),
                new RationalFraction(0, 1), 1));
        circles.add(new Circle(new RationalFraction(1, 2),
                new RationalFraction(1, 2), 2));
        circles.add(new Circle(new RationalFraction(1, 1),
                new RationalFraction(1, 1), 3));
        circles.add(new Circle(new RationalFraction(2, 1),
                new RationalFraction(1, 1), 0.5));
        circles.add(new Circle(new RationalFraction(3, 1),
                new RationalFraction(1, 1), 4));

        System.out.println("Circles with centers on one line : ");
        for (int i=0; i < circles.size(); i++) {
            for (int j =i+1; j < circles.size(); j++) {
                for (int k=j+1; k < circles.size(); k++) {
                    if (circles.get(i).isOnOneLine(circles.get(j),
                            circles.get(k))) {
                        System.out.println(circles.get(i)
                                + ", " + circles.get(j)
                                + ", " + circles.get(k));
                    }
                }
            }
        }

        Circle max= circles.get(0);
        Circle min= circles.get(0);
        for (Circle c: circles) {
            if (c.area() > max.area()) max=c;
            if (c.area() < min.area()) min=c;
        }
        System.out.println("Largest by area : " +max);
        System.out.println("Smallest by area : " +min);
    }
}