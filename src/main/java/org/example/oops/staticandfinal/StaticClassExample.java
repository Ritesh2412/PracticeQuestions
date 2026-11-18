package org.example.oops.staticandfinal;

public class StaticClassExample {
    public static void main(String[] args) {
        Student s1 = new Student("Aditya", 28, 101);
        Student s2 = new Student("Rohan", 28, 102);
  
//        Student.college = "IIT Guwahati";
        System.out.println(s1.name+", "+s1.age+ " ,"+" ,"+s1.roll+" ,"+ Student.college);
        System.out.println(s2.name+", "+s2.age+ " ,"+" ,"+s2.roll+" ,"+ Student.college);
    }
}

class Student{
    String name;
    int age;
    int roll;
    static String college;

    public Student(String name, int age, int roll) {
        this.name = name;
        this.age = age;
        this.roll = roll;
    }

    //Static Block
    static{
       college= "IIT Guwahati";
    }
}
