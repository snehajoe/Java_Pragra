package assignment2;
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double r = scan.nextDouble();
        double area = 3.14*r*r;
        System.out.println("The area of the circle is "+ area);
    }
}