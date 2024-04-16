package assignment5;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String s= scanner.nextLine().toLowerCase();

        char[] chars = s.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                System.out.println("The string is not a palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("The string is a palindrome");
    }
}
