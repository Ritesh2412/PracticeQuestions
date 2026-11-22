package org.example.function;

public class powerOfNumber {
    public static void main(String[] args) {
        System.out.println(powerOfNum(5,4));
    }

    static int powerOfNum(int p, int q){
        if(q==0){
            return 1;
        }
        return powerOfNum(p,q-1) * p;  //p^q -1 * p = p^q
    }
}
