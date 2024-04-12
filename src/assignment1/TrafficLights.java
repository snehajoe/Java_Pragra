package assignment1;
import java.util.Scanner;

public class TrafficLights {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the traffic light color (red, yellow, or green): ");
        String input = scanner.nextLine().toLowerCase();

        String action;
        switch (input) {
            case "red":
                action = "Stop";
                System.out.println("The traffic light is " + input + ", you should " + action + ".");
                break;
            case "yellow":
                action = "Prepare to stop";
                System.out.println("The traffic light is " + input + ", you should " + action + ".");
                break;
            case "green":
                action = "Go";
                System.out.println("The traffic light is " + input + ", you should " + action + ".");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }

        scanner.close();
    }
}