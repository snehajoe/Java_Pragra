package assignment3;
public class FirstTen {
    public static void main(String[] args) {
        int sum =0;
        int num = 1;
        while(num<=10){
            sum += num;
            num++;
        }
        System.out.println("Sum of numbers 1-10 = "+sum);
    }
}

