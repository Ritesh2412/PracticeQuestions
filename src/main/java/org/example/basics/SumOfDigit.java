package org.example.basics;

public class SumOfDigit {
    public static void main(String[] args) {


        // % -> reminder
        // / -> quotient
        int num=123;
        int sum=0;
        while(num>0){
            sum= sum+(num%10); //0+(3)
            num=num/10; //12
        }
        System.out.println(sum);
    }
}
