package assignment5;
import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String input = scanner.nextLine();

        int longestSubstringLength= substringLength(input);
        System.out.println("Length of the longest substring without repeating characters: " + longestSubstringLength);

    }

    public static int substringLength(String s){
        int n = s.length();
        int left=0, right = 0;
        int maxLength = 0;

        while (right < n) {
            for (int i = left; i < right; i++) {
                if (s.charAt(i) == s.charAt(right)) {
                    left = i + 1;
                    break;
                }
            }
            maxLength = Math.max(maxLength, right-left+1);
            right++;
        }
        return maxLength;
    }
}

