package assignment5;

public class ArrayMain {
    public static void main(String[] args) {
        int[] arr = {10,30,43,54,23,543,43,32};

        Array reverse = new Array();
        Array maximum = new Array();
        Array minimum = new Array();
        Array secondMaximum = new Array();
        Array secondMinimum = new Array();
        Array sum = new Array();
        Array average = new Array();

        reverse.arrayReverse(arr);
        System.out.println(" ");

        System.out.println("Maximum element in the array: " + maximum.arrayMax(arr));
        System.out.println("Minimum element in the array: " + minimum.arrayMin(arr));

        System.out.println("Second maximum element in the array: " + secondMaximum.arraySecondMax(arr));
        System.out.println("Second minimum element in the array: " + secondMinimum.arraySecondMin(arr));

        System.out.println("Sum of the elements: "+ sum.arraySum(arr));
        System.out.println("Average of the elements: " + average.arrAverage(arr));
    }
}
