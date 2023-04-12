package HW3;

import java.util.Scanner;

public class CityTemperature {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in) ;
        System.out.println("Enter your city : ");
        String city= scan.next();

        double Fahrenheit, Celsius;

        System.out.println("enter your temperature in fahrenheit : ");
        Fahrenheit = scan.nextDouble();
        Celsius= ((Fahrenheit-32)*5)/9;

        System.out.println("the temperature in  "+city+ "  is " + Celsius + " degrees Celsius");
















    }
}
