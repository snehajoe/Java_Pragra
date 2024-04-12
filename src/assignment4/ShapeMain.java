package assignment4;

public class ShapeMain {
    public static void main(String[] args) {

        Shape circle = new Shape();
        Shape square = new Shape();
        Shape rectangle = new Shape();


        System.out.println("Area of the circle: " + circle.calculateArea(5.0));
        System.out.println("Area of the square: " + square.calculateArea(7));
        System.out.println("Area of the rectangle: " + rectangle.calculateArea(4.0, 6.0));
    }
}
