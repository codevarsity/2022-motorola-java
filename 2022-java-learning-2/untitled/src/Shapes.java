import org.jetbrains.annotations.NotNull;
import org.w3c.dom.css.Rect;

import javax.sound.sampled.Line;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.rmi.NoSuchObjectException;
import java.util.ArrayList;



interface Drawable {
    void draw();
}

abstract class Shape {
    int x;
    int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }


    String description() {
        return "x = " + x + " y = " + y;
    }
}

class Rectangle extends Shape implements Drawable, Comparable{
    int width;
    int height;


    Rectangle(int width, int height) {
       this(0, 0, width, height);
    }

    Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }


    public void draw() {
        System.out.println("Drawing Rectangle");
        System.out.println("Width = " + width + " Height = " + height);
    }


    @Override
    public int compareTo(@NotNull Object o) {
        Rectangle rect = (Rectangle) o;
        return this.width - rect.width;
    }

    @Override
    public String toString() {
        return "Rectangle Width = " + width + " Height = " + height;
    }
}

class Square extends Shape implements Drawable{
    int side;

    Square(int x, int y, int side) {
        super(x, y);
        this.side = side;
    }


    public void draw() {
        System.out.println("Drawing Square");
        System.out.println("Side = " + side);
    }
}

class Point extends Shape implements Drawable{
    int pointSize;
    Point(int x, int y, int pointSize) {
        super(x, y);
        this.pointSize = pointSize;
    }


    public void draw() {
        System.out.println("Drawing Point");
        System.out.println("PointSize = " + pointSize);
    }
}

class LineSegment implements Drawable{
    Point point1;
    Point point2;

    LineSegment() {
        point1 = new Point(10, 10, 1);
        point2 = new Point(50, 50, 1);
    }
    public void draw() {
        System.out.println("Drawing Line Segment " + description());
    }

    String description() {
        return point1.description() + " " + point2.description();
    }
}

class Circle extends Shape implements Drawable{
    int radius;

    Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing Circle");
        System.out.println("Radius = " + radius);
    }
}

class Canvas {

    Drawable[] shapes = new Drawable[5];

    Canvas() {
        shapes[0] = new Circle(10, 10, 100);
        shapes[1] = new Point(10, 10, 2);
        shapes[2] = new Square(10, 10, 100);
        shapes[3]  = new Rectangle(10, 10, 100, 100);
        shapes[4] = new LineSegment();

    }



    void draw() {
        for (int i = 0; i < shapes.length; ++i) {
            shapes[i].draw();
        }
     }
}

public class Shapes {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.draw();

    }
}


class A {
    B messageReceiver;

    A(B messageReceiver) {
        this.messageReceiver = messageReceiver;
    }


    void talkToB() {
        messageReceiver.gotMessage();
    }
}

class B {
    A a;
    void gotMessage() {
        System.out.println("Message");
    }
}

class Child {
    WeakReference<Parent> parent;
}

class Parent {
    Child child;
}