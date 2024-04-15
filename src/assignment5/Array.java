package assignment5;

public class Array {
    public static void arrayReverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.print("Reversed array: ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static int arrayMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int arrayMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int arraySecondMax(int[] arr) {
        int max = arrayMax(arr);
        int secondMax = arr[0];
        for (int i : arr) {
            if(i > secondMax && i != max) {
                secondMax = i;
            }
        }
        return secondMax;
    }
    public static int arraySecondMin(int[] arr) {
        int min = arrayMin(arr);
        int secondMin = arr[0];
        for (int i : arr) {
            if(i < secondMin && i != min) {
                secondMin = i;
            }
        }
        return secondMin;
    }

    public static int arraySum(int[] arr) {
        int sum=0;
        for (int i=0; i<arr.length; i++){
            sum+= arr[i];
        }
        return sum;
    }

    public static double arrAverage(int[] arr) {
        int sum = arraySum(arr);
        double average= 1.0 * sum / 8;
        return average;
    }
}