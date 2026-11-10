package org.example.function;

public class Demo4 {

    static String name= "Ritesh";    //Global scope

    public static void main(String[] args) {
        // Scope of a variable

        int x=5; //local scope
        int y=4;

        if(x==4){
            int j=7;
            System.out.println(j);
        }

        System.out.println(x+","+y);
        fun();

        System.out.println(name);
    }
    static void fun(){
//        System.out.println(x+","+y);   //Cannot do like this because loca scope x, y.
        System.out.println(name);
    }
}
