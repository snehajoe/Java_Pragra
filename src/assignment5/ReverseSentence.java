package assignment5;
import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence: ");
        String input = scanner.nextLine();
        String[] words = input.split(" ");

        ReverseSentence s = new ReverseSentence();
        s.wordsReverse(words);
    }

    public static void wordsReverse(String[] words){
        for (int i = 0, j = words.length - 1; i < j; i++, j--) {
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
        }

        System.out.println("Reversed sentence: ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        System.out.println(" ");
    }
}
