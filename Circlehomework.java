import java.util.Scanner;

public class Circlehomework {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Welcome, enter a radius for the circle: ");
            double radius = scanner.nextDouble();
            scanner.nextLine();
            Circle circle = new Circle(radius);
            System.out.println(circle);
            scanner.close();
        } catch (InvalidSizeException e) {
            System.out.println("The circle radius cannot be zero or negative");
            System.out.println("Here is an alternative circle");
            Circle alternativeCircle = new Circle(1);
            System.out.println(alternativeCircle);
        }
    }

    static class Circle {
        private double radius;

        public Circle(double radius) throws InvalidSizeException {
            setRadius(radius);
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) throws InvalidSizeException {
            if (radius <= 0) {
                throw new InvalidSizeException("Radius must be a positive value");
            }
            this.radius = radius;
        }

        @Override
        public String toString() {
            return "Circle with radius " + radius;
        }
    }

    static class InvalidSizeException extends IllegalArgumentException {
        public InvalidSizeException() {
            super();
        }

        public InvalidSizeException(String message) {
            super(message);
        }
    }
}
