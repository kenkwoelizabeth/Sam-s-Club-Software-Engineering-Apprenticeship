package org.example.inheritance;

class Car extends Vehicle {
    private int doors;


    public Car(String make, String model, int year, int doors) {
        super(make, model, year);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public void start() {
        System.out.println("Car started.");
    }

    public void drive() {
        System.out.println("Car is moving.");
    }
}