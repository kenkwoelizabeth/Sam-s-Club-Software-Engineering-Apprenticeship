package org.example.iheritance2;

class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void startEngine() {
        System.out.println("Starting the vehicle's engine.");
    }

    public void stopEngine() {
        System.out.println("Stopping the vehicle's engine.");
    }

    public void drive() {
        System.out.println("The vehicle is in motion.");
    }
}