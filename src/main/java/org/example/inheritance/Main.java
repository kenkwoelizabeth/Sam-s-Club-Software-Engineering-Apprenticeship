package org.example.inheritance;

public class Main {

    // I made 2 examples of my child classes
    public static void main(String[] args) {
        // create an object of the subclass
        Car c1 = new Car("Toyota", "Venza", 2023, 4);
        // access field of superclass
        c1.start();
        System.out.println(c1.getMake() + " " + c1.getModel() + " with year " + c1.year + " has " + c1.getDoors() + " doors.");


        Truck c2 = new Truck("GMC", "Truck", 2023, 50.7);
        System.out.println(c2.getMake() + " " + c2.getModel() + " with year " + c2.year + " has " + c2.getLoadCapacity() + " load capacity");
        c2.load();
    }
}


