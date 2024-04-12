package assignment4;

public class TemperatureConverter {
    public static double celsiusConvertor(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static double celsiusConvertor(double celsius, double constant) {
        return celsius + constant;
    }

    public static void main(String[] args) {
        double celsius = 20.0;

        double fahrenheit = celsiusConvertor(celsius);
        double kelvin = celsiusConvertor(celsius,273.15);

        System.out.println(celsius + " degrees Celsius is equal to:");
        System.out.println(fahrenheit + " degrees Fahrenheit");
        System.out.println(kelvin + " degrees Kelvin");
    }
}
