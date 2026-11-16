package org.example.oops.constructor;

public class ParameterizedCons {
    public static void main(String[] args) {
        // Parameterized
        Student1 s1 = new Student1("rohit",25,102,"IIT");

        //Defaut
        Student1 s2= new Student1();

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.roll);
        System.out.println(s1.college);
    }
}

class Student1 {
    String name;
    int age;
    int roll;
    String college;

    //Default Constructor
    Student1(){
//        name="Ritesh";
//        age=25;
//        roll=10;
//        college="AMC";
    }

    Student1(String n, int a, int r, String college){
        name=n;
        age=a;
        roll=r;
        college=college;
    }

    void markAttendance() {
        System.out.println("Attendance marked by " + name);
    }
}