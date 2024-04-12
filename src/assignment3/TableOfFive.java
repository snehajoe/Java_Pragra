package assignment3;
import java.util.Scanner;

public class TableOfFive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int i=1, prod=1;

        while(i<=n){
            prod= 5*i;
            System.out.println("5 * "+i+" = "+ prod);
            i++;
        }
    }
}
