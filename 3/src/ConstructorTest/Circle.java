package ConstructorTest;

public class Circle {
    double r;

    public Circle(double a) {
        r = a;
    }

    public double getArea() {
        return r * r * 3.14;
    }

    public double getRadius() {
        return r;
    }
}