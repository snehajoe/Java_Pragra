package oop_assignment.exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DrivingTest {
    private static final int MIN_AGE = 18;
    private static final int MAX_AGE = 100;

    public static void main(String[] args) throws InvalidAgeException{
        int age;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");

        try {
            age = scanner.nextInt();
            if (age < MIN_AGE || age > MAX_AGE) {
                throw new InvalidAgeException("Age must be between " + MIN_AGE + " and " + MAX_AGE + " years old.");
            } else {
                System.out.println("You are eligible to take the driving test.");
            }
        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter a valid age.");
        } finally {
            scanner.close();
            System.out.println("Thank You!");
        }
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}