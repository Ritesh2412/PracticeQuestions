package org.example.function;

public class PrintMultiples {
    public static void main(String[] args) {
        pm(12,5);
    }

    static void pm(int n, int k){
        if(k==1){
            System.out.println(n);
            return;
        }
        pm(n,k-1);
        System.out.println(n*k);
    }
}
