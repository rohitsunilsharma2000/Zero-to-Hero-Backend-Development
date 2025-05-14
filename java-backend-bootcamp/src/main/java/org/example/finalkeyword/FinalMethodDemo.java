package org.example.finalkeyword;



class Vehicle {
    final void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    // void start() {}  // ❌ Error: Cannot override the final method from Vehicle
    // Uncommenting the above line will cause a compilation error
//    void start() {
//        System.out.println("Car is starting...");
//    }
}

public class FinalMethodDemo
{
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start(); // Output: Vehicle is starting...

        Car car = new Car();
        car.start(); // Output: Vehicle is starting...
    }
}