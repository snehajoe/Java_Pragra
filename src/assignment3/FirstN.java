package assignment3;
import java.util.Scanner;

public class FirstN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = scanner.nextInt();
        int sum=0;
        int i=0;

        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println("Sum of numbers 1-"+ n+ " = "+sum);
    }
}
