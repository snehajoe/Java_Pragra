package assignment3;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int i=1, result=1;

        while (i <= n) {
            result *= i;
            i++;
        }
        System.out.println("The factorial of " + n + " is: " + result);
    }
}
