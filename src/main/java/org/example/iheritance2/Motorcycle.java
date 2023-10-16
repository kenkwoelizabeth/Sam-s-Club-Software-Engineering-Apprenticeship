package org.example.iheritance2;

class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the motorcycle's engine.");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("The motorcycle is zipping through the streets.");
    }

    public void wheelie() {
        System.out.println("Popping a wheelie on the motorcycle.");
    }
}