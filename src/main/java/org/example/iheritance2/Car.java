package org.example.iheritance2;

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the car's engine.");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("The car is moving smoothly.");
    }

    public void honkHorn() {
        System.out.println("Honking the car's horn.");
    }
}
