package assignment5;
import java.util.Scanner;

public class CharArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no.of Rows:");
        int i= scanner.nextInt();
        System.out.println("Enter the no.of Columns:");
        int j= scanner.nextInt();

        char[][] arr = new char[i][j];

        for (i=0; i<arr.length; i++){
            for(j=0; j<arr[i].length; j++){
                System.out.println("Enter the character:");
                arr[i][j] = Character.toUpperCase(scanner.next().charAt(0));
            }
        }

        System.out.println("Printing the elements of the character array: ");
        for (int a=0; a<arr.length; a++){
            for(int b=0; b<arr[a].length; b++){
                System.out.print(arr[a][b]+ " ");
            } System.out.println(" ");
        }

    }
}
