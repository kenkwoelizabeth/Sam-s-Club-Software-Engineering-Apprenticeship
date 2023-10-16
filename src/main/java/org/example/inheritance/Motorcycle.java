package org.example.inheritance;

class Motorcycle extends Vehicle {
    private boolean hasSideCar;

    public Motorcycle(String make, String model, int year, boolean hasSideCar) {
        super(make, model, year);
        this.hasSideCar = hasSideCar;
    }

    public boolean isHasSideCar() {
        return hasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    public void ride() {
        System.out.println("Motorcycle is riding.");
    }
}