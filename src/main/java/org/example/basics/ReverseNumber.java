package org.example.basics;

public class ReverseNumber {
    public static void main(String[] args) {
        int num= 1234;
        int temp=num;
        int reversed=0;

        while(temp>0){
            int lastDigit= temp %10;
            reversed= (reversed*10)+lastDigit;
            temp= temp/10;
        }
        System.out.println(reversed);
    }
}
