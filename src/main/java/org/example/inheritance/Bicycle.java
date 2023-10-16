package org.example.inheritance;

class Bicycle extends Vehicle {
    private int numberOfGears;

    public Bicycle(String make, String model, int year, int numberOfGears) {
        super(make, model, year);
        this.numberOfGears = numberOfGears;
    }

    public void pedal() {
        System.out.println("Bicycle is pedaling.");
    }
}