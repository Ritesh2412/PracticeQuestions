package org.example.basics;

import java.util.Scanner;

public class CheckNumberPosNegZero {

    public void checkNumberPosNegZero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int a = sc.nextInt();
        if(a>0){
            System.out.println("Positive");
        } else if (a<0) {
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }
    }
}
