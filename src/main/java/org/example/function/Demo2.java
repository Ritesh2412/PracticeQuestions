package org.example.function;

public class Demo2 {
    public static void main(String[] args) {

        //Function Overloading

        System.out.println(sum(2,4));
        System.out.println(sum(2,3,4));
        greet("Ritesh", 24);
        greet(24, "Rohit");

    }

    static int sum(int a, int b){
        return (a+b);
    }

    static int sum(int a , int b, int c){  //diff number of parameter
        return (a+b+c);
    }

    static int sum(double a, double b){  //diff types of parameter
        return (int)(a+b);
    }

    static void greet(String name, int age){
        System.out.println("Hi "+ name + ". Your age is "+ age);
    }

    static void greet(int age, String name){  //ordering of parameter
        System.out.println("Hi "+ name + ". Your age is "+ age);
    }

    
}
