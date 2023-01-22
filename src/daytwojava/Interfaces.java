package daytwojava;

interface Shapeinterfaces {
    double getArea();
}

class Sqr implements Shapeinterfaces {
    private double side;
    
    Sqr(double side) {
        this.side = side;
    }
    
    public double getArea() {
        return side * side;
    }
}

class Cir implements Shapeinterfaces {
    private double radius;
    
    Cir(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Shapeinterfaces square = new Sqr(5);
        Shapeinterfaces circle = new Cir(3);
        
        System.out.println("Area of square: " + square.getArea());
        System.out.println("Area of circle: " + circle.getArea());
    }
}