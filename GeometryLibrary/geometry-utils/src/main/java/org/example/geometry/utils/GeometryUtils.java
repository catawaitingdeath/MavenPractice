package org.example.geometry.utils;

import org.example.Shape;

public class GeometryUtils {

    private GeometryUtils() {}

    public static double centimetersToMeters(double cm) {
        return cm / 100.0;
    }

    public static double metersToCentimeters(double m) {
        return m * 100.0;
    }

    public static double metersToMillimeters(double m) {
        return m * 1000.0;
    }

    public static int compareByArea(Shape f1, Shape f2) {
        return Double.compare(f1.area(), f2.area());
    }

    public static boolean areAreasEqual(Shape f1, Shape f2, double tolerance) {
        return Math.abs(f1.area() - f2.area()) < tolerance;
    }

    public static Shape maxArea(Shape[] shapes) {
        if (shapes == null || shapes.length == 0) return null;
        Shape max = shapes[0];
        for (Shape f : shapes) {
            if (f.area() > max.area()) max = f;
        }
        return max;
    }

    public static Shape minArea(Shape[] shapes) {
        if (shapes == null || shapes.length == 0) return null;
        Shape min = shapes[0];
        for (Shape f : shapes) {
            if (f.area() < min.area()) min = f;
        }
        return min;
    }
}
