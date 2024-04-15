package assignment5;

public class ArrayAddition {
    public static void main(String[] args) {
        int[][] array1= {{54,12,4}, {2,36,40}, {6,4,5}};
        int[][] array2 = {{2,9,40}, {5,3,6}, {3,5,12}};

        int[][] arr = new int[3][3];

        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array2.length; j++){
                arr[i][j] = array1[i][j] + array2[i][j];
            }
        }

        System.out.println("Result matrix: ");
        for (int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]+ " ");
            } System.out.println(" ");
        }

    }

}
