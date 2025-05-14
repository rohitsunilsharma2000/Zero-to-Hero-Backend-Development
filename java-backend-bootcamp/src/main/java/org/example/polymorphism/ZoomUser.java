package org.example.polymorphism;

public abstract class ZoomUser {

    String name;

    public ZoomUser ( String name ) {
        this.name = name;
    }

    abstract void joinCall();  // Abstract method
}
