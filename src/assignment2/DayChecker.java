package assignment2;
import java.util.Scanner;

public class DayChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine().toLowerCase();

        switch (day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println(day + " is a weekday.");
                break;
            case "saturday":
            case "sunday":
                System.out.println(day + " is a weekend.");
                break;
            default:
                System.out.println("Invalid input, Please enter a valid day.");
                break;
        }

        scanner.close();
    }
}

