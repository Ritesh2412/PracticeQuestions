package org.example.oops.constructor;

public class Demo {
    public static void main(String[] args) {
        Student2 s1= new Student2();
//        Student2 s2= new Student2("Aditya");
//        Student2 s3= new Student2("Rohit", 28);
//        Student2 s4= new Student2("Rohit", 28,102);
//        Student2 s5= new Student2("Rohit", 28,102,"IIT");
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.roll);
        System.out.println(s1.college);
    }
}

// Constructor chaining
class Student2 {
    String name;
    int age;
    int roll;
    String college;

    Student2(){
        this("Unknown");
        System.out.println("1st");
    }

    Student2(String name){
//        this.name=name; one way
        this(name,0);  //another way
        System.out.println("2nd");
    }

    Student2(String name, int age){
        this(name,age,0);
        System.out.println("3rd");
    }

    Student2(String name, int age, int roll){
        this(name, age, roll,"Unknown");
        System.out.println("4th");
    }

    Student2(String name, int age, int roll, String college){
        this.name=name;
        this.age=age;
        this.roll=roll;
        this.college=college;

        System.out.println("5th");
    }


    void markAttendance() {
        System.out.println("Attendance marked by " + name);
    }
}
