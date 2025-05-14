package org.example.polymorphism;

public class Host extends ZoomUser {
    // Constructor
    public Host(String name) {
        super(name);
    }

    // Implement the abstract method
    @Override
    void joinCall() {
        System.out.println(name + " is hosting the call.");
    }
}
