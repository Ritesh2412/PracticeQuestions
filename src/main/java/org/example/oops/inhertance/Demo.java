package org.example.oops.inhertance;

public class Demo {
    public static void main(String[] args) {
        EngineeringStudent es = new EngineeringStudent();
        es.markAttendance();
        es.attendLab();

        Student s1= new Student();
        s1.markAttendance();
//        s1.attendLab();  //(wrong)
    }
}

/* parent (super class) --> child(subclass)*/

class Student {
    String name;
    int age;

    void markAttendance(){
        System.out.println("Attendance marked");
    }
}

class EngineeringStudent extends Student{
    void attendLab(){
        super.markAttendance(); // super (reference of parent object)
        System.out.println("Lab Attended");
    }
}
