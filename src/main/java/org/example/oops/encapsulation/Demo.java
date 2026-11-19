package org.example.oops.encapsulation;

public class Demo {
    public static void main(String[] args) {
        BankAccount ba= new BankAccount();
        ba.deposite(500);
        ba.withdraw(300);
        System.out.println(ba.getBalance());
    }
}

class BankAccount{
    private double balance;

    public void deposite(int amount){
        balance += amount;
    }

    public void withdraw(int amount){
        balance -= amount;
    }

    // getters/setters
    public double getBalance(){
        return balance;
    }

}

class Student{
    private String name;
    private int age;
    private int roll;
    private String College;

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return College;
    }

    public void setCollege(String college) {
        //Validation --> college should be real
        College = college;
    }
    
    //constructor
    public Student(String name, int age, int roll, String college) {
        this.name = name;
        this.age = age;
        this.roll = roll;
        College = college;
    }
}
