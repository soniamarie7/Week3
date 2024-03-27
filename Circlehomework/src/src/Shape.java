package src;
class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double area() {
        return 0.0; // Placeholder implementation for demonstration
    }

    public double perimeter() {
        return 0.0; // Placeholder implementation for demonstration
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Shape other = (Shape) obj;
        return color.equals(other.color);
    }
}

class Square extends Shape {
    private double sideLength;

    public Square(String color, double sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public double area() {
        return sideLength * sideLength;
    }

    @Override
    public double perimeter() {
        return 4 * sideLength;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj))
            return false;
        Square other = (Square) obj;
        return sideLength == other.sideLength;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj))
            return false;
        Circle other = (Circle) obj;
        return radius == other.radius;
    }

    public static void main(String[] args) {
        Square square = new Square("red", 5);
        Circle circle = new Circle("blue", 3);

        System.out.println("Square: Color - " + square.getColor() + ", Side Length - " + square.getSideLength() +
                ", Area - " + square.area() + ", Perimeter - " + square.perimeter());
        System.out.println("Circle: Color - " + circle.getColor() + ", Radius - " + circle.getRadius() +
                ", Area - " + circle.area() + ", Circumference - " + circle.perimeter());
    }
}

