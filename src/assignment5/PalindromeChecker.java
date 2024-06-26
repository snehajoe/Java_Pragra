package assignment5;
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String input = scanner.nextLine().toLowerCase();
        char[] chars = input.toCharArray();

        PalindromeChecker p= new PalindromeChecker();
        p.palindrome(chars);
    }

    public static void palindrome(char[] chars){
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (chars[left] != chars[right]) {
                System.out.println("The string is not a palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("The string is a palindrome");
    }
}
