import java.awt.Point;

// 필드의 초기화
class Rectangle {
    public int width = 0;
    public int height = 0;
    public Point origin;

    public Rectangle() {
        origin = new Point(0, 0);
    }

    public Rectangle(Point p, int w, int h) {
        origin = p;
        this.width = w;
        this.height = h;
    }
}

// 클래스와 객체의 사용 예
class Cylinder {
    private Circle c;
    private int height;

    public Cylinder(Circle a, int b) {
        c = a;
        height = b;
    }

    public double getVolume() {
        return c.getArea() * height;
    }
}

class Circle {
    double radius;

    public Circle(double r) {
        radius = r;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }
}

public class App {
    public static void main(String[] args) {
        // Point originOne = new Point(23, 94);
        // Rectangle RectOne = new Rectangle(originOne, 100, 200);
        // System.out.println(RectOne.origin.x);
        // System.out.println(RectOne.origin.y);
        // System.out.println(RectOne.width);
        // System.out.println(RectOne.height);

        Circle c = new Circle(3);
        Cylinder cy = new Cylinder(c, 10);
        System.out.println(cy.getVolume());
    }
}