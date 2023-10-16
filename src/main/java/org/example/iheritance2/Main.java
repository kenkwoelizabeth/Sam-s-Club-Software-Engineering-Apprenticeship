package org.example.iheritance2;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022, 4);
        Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", 2022, false);

        myCar.startEngine();
        myCar.drive();
        myCar.honkHorn();

        System.out.println();

        myMotorcycle.startEngine();
        myMotorcycle.drive();
        myMotorcycle.wheelie();
    }  }