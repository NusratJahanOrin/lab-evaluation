package com.mycompany.problem6;

abstract class Vehicle {
    String name;

    Vehicle(String name) {
        this.name = name;
    }

    abstract double fuelEfficiency();

    void displayInfo() {
        System.out.println(name + " - " + fuelEfficiency());
    }
}

class Car extends Vehicle {
    Car(String name) {
        super(name);
    }

    double fuelEfficiency() {
        return 15.0;
    }
}

class Bike extends Vehicle {
    Bike(String name) {
        super(name);
    }

    double fuelEfficiency() {
        return 40.0;
    }
}

public class Problem6 {
    public static void main(String[] args) {
        Vehicle car = new Car("Car");
        Vehicle bike = new Bike("Bike");

        car.displayInfo();
        bike.displayInfo();
    }
}
