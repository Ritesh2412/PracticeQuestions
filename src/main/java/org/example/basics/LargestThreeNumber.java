package org.example.basics;

public class LargestThreeNumber {

    public void largestThreeNumber(){
        int a=5;
        int b=8;
        int c=2;

        if(a>b && a>c){
            System.out.println("a is greater");
        } else if (b>a && b>c) {
            System.out.println("b is greater");
        } else{
            System.out.println("c is greater");
        }


        //Using ternary operator
        int max=0;
        max= a>b? a>c?a:c : b>c? b:c;
        System.out.println("Max "+ max);
    }
}
