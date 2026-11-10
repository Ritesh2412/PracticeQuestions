package org.example.function;

public class Demo {
    public static void main(String[] args) {
        // Function in java
        greet();

        sayHello("Ritesh");  //Arguments

        System.out.println(getNumber());

        System.out.println(multiply(2,3));

    }

    //No I/P, No O/P
    static void greet(){
        System.out.println("Hello");  //Argument
//        return;
    }

    // I/P, No O/P
    static void sayHello(String name){
        System.out.println("Hello " + name);
    }
    // No I/P, O/P
        static int getNumber(){

        return 10;
        }
    // I/P, O/P
    static int multiply(int a, int b){
        int mul= a*b;
        return mul;
    }


}
