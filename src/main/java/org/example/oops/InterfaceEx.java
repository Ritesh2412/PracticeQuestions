package org.example.oops;

public class InterfaceEx {
    public static void main(String[] args) {
        Car1 car = new ElectricCar1();
        car.starts();
        car.accelerates();
        car.brakes();
    }
}

interface Car1{
    void starts();
    void accelerates();
    void brakes();
}

class FuelCar1 implements Car1{

    @Override
    public void starts(){
        System.out.println("Fuel Car started");
    }

    @Override
    public void accelerates(){
        System.out.println("Fuel Car accelerating");
    }

    @Override
    public void brakes(){
        System.out.println("Fuel Car stopping...");
    }
}

class ElectricCar1 implements Car1 {

    @Override
    public void starts() {
        System.out.println("Electric Car started");
    }

    @Override
    public void accelerates() {
        System.out.println("Electric Car accelerating");
    }

    @Override
    public void brakes() {
        System.out.println("Electric Car stopping...");
    }

}