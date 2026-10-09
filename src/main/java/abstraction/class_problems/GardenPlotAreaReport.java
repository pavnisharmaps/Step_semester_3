package main.java.abstraction.class_problems;

import java.util.Scanner;

abstract class Plot {
    abstract double getArea();
}

class Circle extends Plot {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Plot {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getArea() {
        return length * width;
    }
}

class Triangle extends Plot {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double getArea() {
        return 0.5 * base * height;
    }
}

public class GardenPlotAreaReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String owner = sc.next();
            Plot p;

            if (type.equals("CIRCLE"))
                p = new Circle(sc.nextDouble());
            else if (type.equals("RECTANGLE"))
                p = new Rectangle(sc.nextDouble(), sc.nextDouble());
            else
                p = new Triangle(sc.nextDouble(), sc.nextDouble());

            double area = p.getArea();
            System.out.printf("%s (%s): %.2f%n", owner, type, area);
            total += area;
        }

        System.out.printf("Total Area: %.2f%n", total);
        sc.close();
    }
}