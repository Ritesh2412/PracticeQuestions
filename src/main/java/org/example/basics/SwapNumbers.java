package org.example.basics;

import java.util.Scanner;

public class SwapNumbers {
    public void swap(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first no.: "); //5
        int a= sc.nextInt();

        System.out.println("Enter second no.: ");  //7
        int b= sc.nextInt();

        System.out.println("Before Swapping...");
        System.out.println("a ="+ a);
        System.out.println("b ="+ b);

        a= a+b; //5+7=12
        b=a-b;  //12-7=5
        a=a-b;  //12-5=7

        System.out.println("After Swapping...");
        System.out.println("a ="+ a);
        System.out.println("b ="+ b);
    }
}
