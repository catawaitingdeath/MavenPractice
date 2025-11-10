package org.example;

import org.example.geometry.utils.GeometryUtils;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4, 6),
                new Triangle(3, 4, 5)
        };

        Shape3D[] shapes3d = {
                new Cube(5),
                new Sphere(6),
                new Pyramid(3, 4)
        };

        for (Shape f : shapes) {
            System.out.println(f);
            System.out.printf("  Area: %.2f%n", f.area());
            System.out.printf("  Perimeter: %.2f%n%n", f.perimeter());
        }
        System.out.println("Max area: " + GeometryUtils.maxArea(shapes));
        System.out.println("Min area: " + GeometryUtils.minArea(shapes));
        System.out.println();

        for (Shape3D f : shapes3d) {
            System.out.println(f);
            System.out.printf("  Volume: %.2f%n", f.volume());
            System.out.printf("  Surface area: %.2f%n%n", f.surfaceArea());
        }
    }
}