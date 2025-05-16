package org.example.exceptions;

public class Cab {
    private String cabNumber;
    private boolean isAvailable;

    // Constructor with validation
    public Cab(String cabNumber, boolean isAvailable) {
        if (cabNumber == null || cabNumber.isEmpty()) {
            throw new IllegalArgumentException("Cab number cannot be null or empty");
        }
        this.cabNumber = cabNumber;
        this.isAvailable = isAvailable;
    }

    // Getter for cab number
    public String getCabNumber() {
        return cabNumber;
    }

    // Getter for availability
    public boolean isAvailable() {
        return isAvailable;
    }

    // Setter for availability
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    @Override
    public String toString() {
        return "Cab{" +
                "cabNumber='" + cabNumber + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
