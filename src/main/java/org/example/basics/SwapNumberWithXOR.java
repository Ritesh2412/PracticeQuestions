package org.example.basics;

import java.util.Scanner;

public class SwapNumberWithXOR {
    public void swap(){

        //0^0=0
        //1^0=1         (XOR rule)
        //0^1=1
        //1^1=0



        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first no.: "); //5=101(binary
        int a= sc.nextInt();

        System.out.println("Enter second no.: ");  //3=011(binary
        int b= sc.nextInt();

        System.out.println("Before Swapping...");
        System.out.println("a ="+ a);
        System.out.println("b ="+ b);

        a= a^b; //101^011=110=6
        b=a^b;  //110^011=101=5
        a=a^b;  //110^101=011=3

        System.out.println("After Swapping...");
        System.out.println("a ="+ a);
        System.out.println("b ="+ b);
    }
}
