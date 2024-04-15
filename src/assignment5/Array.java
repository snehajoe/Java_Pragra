package assignment5;

public class Array {
    public static void main(String[] args) {
        int[] arr = {10,30,43,54,23,543,43,32};

        System.out.print("Reversed array: ");
        arrayReverse(arr);
        System.out.println(" ");

        arrayMax(arr);
        arrayMin(arr);

        System.out.println("Sum of the elements: "+arraySum(arr));
        arrAverage(arr);
    }

    public static void arrayReverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void arrayMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element in the array: " + max);
    }

    public static void arrayMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum element in the array: " + min);
    }

    public static int arraySum(int[] arr) {
        int sum=0;
        for (int i=0; i<arr.length; i++){
            sum+= arr[i];
        }
        return sum;
    }

    public static void arrAverage(int[] arr) {
        int sum = arraySum(arr);
        double average= 1.0 * sum / 8;
        System.out.println("Average of the elements: " + average);
    }
}