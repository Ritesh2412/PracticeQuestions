package org.example.function;

public class FibonacciSeries {
    public static void main(String[] args) {

        int n= fibo(5);
        System.out.println(n);
    }

    static int fibo(int n){

        if(n==0 || n==1){
            return 1;
        }

        int x= fibo(n-1);
        int y= fibo(n-2);
        return x+y;
    }
}
