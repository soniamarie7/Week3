
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
    
        public boolean equals(Circle other) {
            return this.radius == other.getRadius();
        }

        public static void main(String[] args) {
            Circle circle1 = new Circle(3);
            Circle circle2 = new Circle(5);
            Circle circle3 = new Circle(3);
    
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
    
            System.out.println("\nCircle 3:");
            System.out.println("Radius: " + circle3.getRadius());
            System.out.println("Diameter: " + circle3.diameter());
            System.out.println("Circumference: " + circle3.circumference());
            System.out.println("Area: " + circle3.area());
    
            // Compare circles for an equal value
            System.out.println("\nComparing Circle 1 with Circle 2: " + circle1.equals(circle2));
            System.out.println("Comparing Circle 1 with Circle 3: " + circle1.equals(circle3));
        }
    }