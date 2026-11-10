package org.example.function;

public class Demo3 {
    public static void main(String[] args) {
        //chaning of function
        A();
        System.out.println("Bye");
    }

    static void A(){
        B();
        System.out.println("Hi");
    }

    static void B(){
        System.out.println("Hello");
    }
}
