abstract class Shape {
    abstract double area();
}
interface Drawable {
    void draw();
}
class Circle extends Shape implements Drawable {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    double area() {
        return Math.PI * radius * radius;
    }
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
class Rectangle extends Shape implements Drawable {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double area() {
        return length * width;
    }
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(4);
        Shape s2 = new Rectangle(6, 8);
        System.out.println("Circle Area: " + s1.area());
        System.out.println("Rectangle Area: " + s2.area());
        Drawable d1 = new Circle(2);
        Drawable d2 = new Rectangle(3, 5);
        d1.draw();
        d2.draw();
    }
}
