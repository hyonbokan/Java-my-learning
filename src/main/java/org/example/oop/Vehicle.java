package org.example.oop;

abstract class Vehicle {
    private String make;
    private String model;
    private int year;

    // constructor
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // encapsulation
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Concrete method
    public void displayDetails() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
    }

    // abstract method
    public abstract void startEngine();

    public void honk() {
        System.out.println("Generic vehicle honk!");
    }

    public abstract void stopEngine();

}

class Car extends Vehicle {
    public Car(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void startEngine(){
        System.out.println("Car engine started with a key!");
    }

    @Override
    public void stopEngine(){
        System.out.println("\nCAR engine stops ...");
    }

    @Override
    public void honk() {
        System.out.println("Car honk: Beep beep!");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started with a button!");
    }

    @Override
    public void honk() {
        System.out.println("Motorcycle honk: Meep meep!");
    }

    @Override
    public void stopEngine() {
        System.out.println("\nBIKE's engine stops ...");
    }
}
