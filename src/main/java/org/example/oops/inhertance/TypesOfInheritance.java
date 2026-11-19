package org.example.oops.inhertance;



public class TypesOfInheritance {
    public static void main(String[] args) {
        CSEEngineeringStudent cse = new CSEEngineeringStudent();
        cse.attentCSELab();
        cse.attendLab();
        cse.markAttendance();
    }
}

class Student1 { //Parent  --> A
    String name;
    int age;

    void markAttendance(){
        System.out.println("Attendance marked");
    }
}

class EngineeringStudent1 extends Student1{  //child  -->B
    void attendLab(){
        System.out.println("Lab Attended");
    }
}

class MechanicalEngineeringStudent extends Student1 {  //child -->C
    void attentMechLab() {
        System.out.println("mechanical lab");
    }
}

class CSEEngineeringStudent extends EngineeringStudent1{
    void attentCSELab(){
        System.out.println("cse lab");
    }

/*
student1 -->  EngineeringStudent1 --> CSEEngineeringStudent (Multilevel)

(Hierarchical)
        A
       / \
      B   C
*/
}

