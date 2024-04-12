package assignment3;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to my calculator");

        String c;

        do{
            System.out.println("1. Press 1 for addition");
            System.out.println("2. Press 2 for multiplication");
            System.out.println("3. Press 3 for subtraction");
            System.out.println("4. Press 4 for division");
            System.out.println("5. Press 5 for modulus");
            System.out.println("6. Press 0 for exit");
            System.out.println("Please enter your input : ");

            int input = scanner.nextInt();

            System.out.println("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.println("Enter second number: ");
            double num2 = scanner.nextDouble();
            switch (input) {
                case 1:
                    System.out.println("Result = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result = " + (num1 * num2));
                    break;
                case 3:
                    System.out.println("Result = " + (num1 - num2));
                    break;
                case 4:
                    //double div= (double) num1 / num2;
                    System.out.println("Result = " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("Result = " + (num1 % num2));
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
            System.out.println("Do you still want to continue? Press 'C' for Continue, Press 'Q' for Quit :");

            c = scanner.next();

        }while(c.equalsIgnoreCase("C"));

    }
}

