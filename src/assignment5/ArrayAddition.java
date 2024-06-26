package assignment5;

public class ArrayAddition {
    public static void main(String[] args) {
        int[][] array1 = {{54, 12, 4}, {2, 36, 40}, {6, 4, 5}};
        int[][] array2 = {{2, 9, 40}, {5, 3, 6}, {3, 5, 12}};

        ArrayAddition add = new ArrayAddition();
        add.arrAdd(array1,array2);
    }

    public static void arrAdd(int[][] array1,int[][] array2){
        int[][] array = new int[3][3];

        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array2.length; j++){
                array[i][j] = array1[i][j] + array2[i][j];
            }
        }

        System.out.println("Result matrix: ");
        for (int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                System.out.print(array[i][j]+ " ");
            } System.out.println(" ");
        }
    }

}
