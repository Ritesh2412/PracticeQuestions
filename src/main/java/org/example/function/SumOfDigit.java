package org.example.function;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(sod(1234));
    }

    static int sod(int n){
        if(n>=0 && n<=9){
            return n;
        }
        int smallerAns= sod(n/10);
        int ans= smallerAns + n%10;
        return ans;
    }
}

