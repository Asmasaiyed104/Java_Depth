package Abstraction.Projects;

public abstract class Vehicle {

    // Abstract method
    abstract void start();

    // Static nested class Car
    static class Car extends Vehicle {
        void start() {
            System.out.println("Starts with key");
        }
    }

    // Static nested class Scooter
    static class Scooter extends Vehicle {
        void start() {
            System.out.println("Starts with kick");
        }
    }

    // Correct class name: AbstractDemo
    public static class AbstractDemo {
        public static void main(String[] args) {// Creating an instance of Car
            Car ob = new Car();
            ob.start(); // Output: Starts with key
        }
    }
}
