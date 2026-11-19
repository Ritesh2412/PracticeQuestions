package org.example.oops.inhertance;

public class SuperExample {
    public static void main(String[] args) {
//        EngStu s1= new EngStu();
//        s1.name="aditya";
//        s1.age=28;
//        s1.roll=101;
//        s1.college="AMC";
//        s1.print();

        EngStu s2= new EngStu("Aditya",28,101,"IIT");
        s2.print();
    }
}

class Stu {
    String name;
    int age;
    int roll;

    Stu(){

    }

    Stu(String name, int age, int roll) {
        this.name = name;
        this.age = age;
        this.roll = roll;
    }

    void print(){
        System.out.println(name+" ,"+ age+ " ," + roll);
    }
}

class EngStu extends Stu{
    String college;

    EngStu(String name, int age, int roll, String college){
        super(name, age, roll);
        this.college = college;
    }

    void print(){
        super.print();
        System.out.println(college);
    }
}
