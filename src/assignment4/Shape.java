package assignment4;

public class Shape {
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateArea(int side) {
        return side * side;
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }
}
