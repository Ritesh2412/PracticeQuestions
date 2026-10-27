package org.example.basics;

import java.util.Scanner;

public class PowONumber {
    public static void main(String[] args) {

        int a=2;
        int b=3;

        double c= Math.pow(a,b);
//        System.out.println(c);

        //--------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter exponent (integer): ");
        int exponent = scanner.nextInt();

        double result = 1.0;

        // Take the absolute value of the exponent for the loop
        int absExponent = Math.abs(exponent);

        for (int i = 0; i < absExponent; i++) {
            result *= base;
        }

        // If the exponent was negative, invert the final result (e.g., 2^-3 = 1 / 2^3)
        if (exponent < 0) {
            result = 1.0 / result;
        }

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        scanner.close();
    }
}
