package org.example;

public class Cube extends Shape3D{

    private final double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double volume() {
        return Math.pow(side, 3);
    }

    @Override
    public double surfaceArea() {
        return 6 * side * side;
    }

    @Override
    public String toString() {
        return "Cube (a=" + side + ")";
    }
}
