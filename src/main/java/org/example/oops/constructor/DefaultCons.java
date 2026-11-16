package org.example.oops.constructor;

public class DefaultCons {
    public static void main(String[] args) {

        Student s1= new Student();
        s1.name="Aditya";
        s1.age=28;
        s1.roll=101;
        s1.college="IIT Guwahati";

        //Constructors --> To create an object

        //Default Values
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.roll);
        System.out.println(s1.college);

//        int x;  //local variable  --> No Default Values
//        System.out.println(x);
    }
}

/*
Default Value
Integer --> 0
Floating --> 0.0
Boolean --> false
String --> null (nothing)

*/

class Student{
    String name;  //  info/data/characteristics --> instance variables
    int age;
    int roll;
    String college;

    void markAttendance(){  //behaviours  --> instance methods
        System.out.println("Attendance marked by "+ name);
    }
//
//    void print(){
//        System.out.println(name+","+age+","+roll+","+college);
//    }
}
