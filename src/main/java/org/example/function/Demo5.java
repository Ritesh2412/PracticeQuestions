package org.example.function;

public class Demo5 {
    public static void main(String[] args) {
        //Recursion
        int n=5;
        printNum(n);
    }
    static void printNum(int n){
        if(n==0){
            return;
        }
        printNum(n-1);
        System.out.println(n);
    }
}
