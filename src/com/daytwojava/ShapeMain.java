package com.daytwojava;


abstract class ShapeMain {
    protected String shapeName;

    ShapeMain(String shapeName) {
        this.shapeName = shapeName;
    }

    abstract double calculateArea();
}

class Square extends ShapeMain {
    private int side;

    Square(int side) {
        super("Square");
        this.side = side;
    }
public int getSide() {
    return side;
}

public void setSide(int side) {
    this.side = side;
}

double calculateArea() {
    return side * side;
}
}
class Rectangle extends ShapeMain {
    private int length;
    private int breadth;

    Rectangle(int length, int breadth) {
        super("Rectangle");
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return length * breadth;
    }
}
class Circle extends ShapeMain {
    private int radius;

    Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
