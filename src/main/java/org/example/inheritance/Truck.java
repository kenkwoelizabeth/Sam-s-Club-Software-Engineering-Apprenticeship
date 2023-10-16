package org.example.inheritance;

class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String make, String model, int year, double loadCapacity) {
        super(make, model, year);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void load() {
        System.out.println("Truck is loading.");
    }
}