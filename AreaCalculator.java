// Java program to calculate the area of different shapes using overloaded functions

public class AreaCalculator {

    // Method to calculate area of a circle (overloaded)
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;  // Area of circle = π * r^2
    }

    // Method to calculate area of a rectangle (overloaded)
    public double calculateArea(double length, double width) {
        return length * width;  // Area of rectangle = length * width
    }

    // Method to calculate area of a square (overloaded)
    public double calculateArea(int side) {
        return side * side;  // Area of square = side^2
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        // Calculate area of a circle with radius 5
        double circleArea = calculator.calculateArea(5.0);
        System.out.println("Area of Circle: " + circleArea);

        // Calculate area of a rectangle with length 4 and width 6
        double rectangleArea = calculator.calculateArea(4.0, 6.0);
        System.out.println("Area of Rectangle: " + rectangleArea);

        // Calculate area of a square with side 4
        double squareArea = calculator.calculateArea(4);
        System.out.println("Area of Square: " + squareArea);
    }
}

