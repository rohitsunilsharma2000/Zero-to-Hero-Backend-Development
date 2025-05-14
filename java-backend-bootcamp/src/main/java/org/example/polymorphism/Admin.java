package org.example.polymorphism;

public class Admin extends ZoomUser {
    // Constructor
    public Admin(String name) {
        super(name);
    }

    // Implement the abstract method
    @Override
    void joinCall() {
        System.out.println(name + " joined as ADMIN and is monitoring the call.");
    }
}
