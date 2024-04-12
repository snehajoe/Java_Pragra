package assignment2;
import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of square: ");
        double l = scan.nextDouble();
        double area = l*l;
        System.out.println("The area of the square is "+ area);
    }
}
