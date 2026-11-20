package org.example.oops.abstraction;

public class Demo {
    public static void main(String[] args) {
//        Car car = new Car(); //Car' is abstract; cannot be instantiated

        Car car = new ElectricCar();
        car.start();
        car.accelerate();
        car.brake();
    }
}

abstract class Car{
    void start(){
        System.out.println("Car started");
    }

    abstract void accelerate();

    abstract void brake();
}

class FuelCar extends Car{

    @Override
    void accelerate(){
        System.out.println("Fuel Car accelerating");
    }

    @Override
    void brake(){
        System.out.println("Fuel Car stopping...");
    }
}

class ElectricCar extends Car{

    @Override
    void accelerate(){
        System.out.println("Electric Car accelerating");
    }

    @Override
    void brake(){
        System.out.println("Electric Car stopping...");
    }
}