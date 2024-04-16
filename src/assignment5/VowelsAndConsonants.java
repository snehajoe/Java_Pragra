package assignment5;
import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = scanner.nextLine().toLowerCase();
        char[] chars = s.toCharArray();

        VowelsAndConsonants a = new VowelsAndConsonants();
        a.alphabets(chars);
    }

    public static void alphabets(char[] chars){
        int vowels = 0;
        int consonants = 0;

        for( char c : chars){
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
        System.out.println("No.of vowels     : "+vowels);
        System.out.println("No.of consonants : "+consonants);

    }
}
