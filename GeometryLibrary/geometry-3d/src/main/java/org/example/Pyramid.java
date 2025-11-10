package org.example;

public class Pyramid extends Shape3D{
    private final double baseLength;
    private final double height;

    public Pyramid(double baseLength, double height) {
        if (baseLength <= 0 || height <= 0)
            throw new IllegalArgumentException("Длина основания и высота должны быть положительными");
        this.baseLength = baseLength;
        this.height = height;
    }

    @Override
    public double volume() {
        return (1.0 / 3.0) * Math.pow(baseLength, 2) * height;
    }

    @Override
    public double surfaceArea() {
        double slantHeight = Math.sqrt(Math.pow(height, 2) + Math.pow(baseLength / 2, 2));
        double baseArea = Math.pow(baseLength, 2);
        double lateralArea = 2 * baseLength * slantHeight;
        return baseArea + lateralArea;
    }

    @Override
    public String toString() {
        return "Pyramid (" + baseLength + " x " + height + ")";
    }
}
