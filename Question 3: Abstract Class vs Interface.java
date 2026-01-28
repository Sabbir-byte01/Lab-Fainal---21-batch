abstract class Shape {
    public abstract double area();
}

interface Drawable {
    void draw();
}

class Circle extends Shape implements Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.1416 * radius * radius;
    }

    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape implements Drawable {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5);
        Shape s2 = new Rectangle(6, 10);

        System.out.println(s1.area());
        System.out.println(s2.area());

        Drawable d1 = new Circle(4);
        Drawable d2 = new Rectangle(5, 7);

        d1.draw();
        d2.draw();
    }
}

Both abstraction mechanisms are used because they serve different purposes.
The abstract class Shape defines a common structure and forces all shapes to implement the area() method.
The interface Drawable represents a common behavior (drawing) that can be shared by different classes, regardless of their position in the class hierarch.

We can get better design, flexibility, and supports multiple inheritance of behavior in Java through using both abstraction mechanisms.
  
