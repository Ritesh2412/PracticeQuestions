package org.example.function;

public class Factorial {
    public static void main(String[] args) {
        int n=5;
        System.out.println(factoria(n));
    }

    static int factoria(int n){
        if(n==1){
            return 1;
        }
        return n * factoria(n-1);
    }
}
