package assignment5;
import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String input = scanner.nextLine();
        String[] words = input.split(" ");

        StringLength s = new StringLength();
        s.subStringLength(words);

    }

    public static void subStringLength(String[] words){


    }
}
