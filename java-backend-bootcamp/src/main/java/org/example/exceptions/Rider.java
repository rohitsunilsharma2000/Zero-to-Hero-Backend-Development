package org.example.exceptions;

public class Rider {
    private String name;

    // Constructor with validation
    public Rider(String name) throws InvalidUserException {
//        if (name == null || name.trim().isEmpty()) {
//            throw new InvalidUserException("Rider name cannot be null or empty");
//        }
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Optional: Setter with validation if you want to allow name changes
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Rider name cannot be null or empty");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return "Rider{name='" + name + "'}";
    }
}
