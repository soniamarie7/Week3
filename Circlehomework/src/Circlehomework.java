
    import java.lang.Math;

    class Circle {
        private double radius;
    
        public Circle(double radius) {
            this.radius = radius;
        }
    
        public Circle() {
            this(1); // Default radius if none provided
        }
    
        public double getRadius() {
            return this.radius;
        }
    
        public void setRadius(double radius) {
            this.radius = radius;
        }
    
        public double diameter() {
            return 2 * radius;
        }
    
        public double circumference() {
            return 2 * Math.PI * radius;
        }
    
        public double area() {
            return Math.PI * radius * radius;
        }

        public static void main(String[] args) {
            Circle circle1 = new Circle(3);
            Circle circle2 = new Circle(5);
    
            System.out.println("Circle 1:");
            System.out.println("Radius: " + circle1.getRadius());
            System.out.println("Diameter: " + circle1.diameter());
            System.out.println("Circumference: " + circle1.circumference());
            System.out.println("Area: " + circle1.area());
    
            System.out.println("\nCircle 2:");
            System.out.println("Radius: " + circle2.getRadius());
            System.out.println("Diameter: " + circle2.diameter());
            System.out.println("Circumference: " + circle2.circumference());
            System.out.println("Area: " + circle2.area());
    
            // Change properties of circle2
            circle2.setRadius(7);
    
            System.out.println("\nAfter changing circle2:");
            System.out.println("Circle 1:");
            System.out.println("Radius: " + circle1.getRadius());
            System.out.println("Diameter: " + circle1.diameter());
            System.out.println("Circumference: " + circle1.circumference());
            System.out.println("Area: " + circle1.area());
    
            System.out.println("\nCircle 2:");
            System.out.println("Radius: " + circle2.getRadius());
            System.out.println("Diameter: " + circle2.diameter());
            System.out.println("Circumference: " + circle2.circumference());
            System.out.println("Area: " + circle2.area());
            
        }
    }
