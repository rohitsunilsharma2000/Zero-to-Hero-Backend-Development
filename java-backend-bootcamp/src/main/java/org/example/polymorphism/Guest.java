package org.example.polymorphism;

public class Guest extends ZoomUser {
    // Constructor
    public Guest(String name) {
        super(name);
    }

    // Implement the abstract method
    @Override
    void joinCall() {
        System.out.println(name + " is joining the call as a guest.");
    }
}
