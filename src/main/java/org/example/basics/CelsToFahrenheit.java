package org.example.basics;

import java.util.Scanner;

public class CelsToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Apply the formula using decimal values for precision
        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;

        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");

        scanner.close();
    }
}
