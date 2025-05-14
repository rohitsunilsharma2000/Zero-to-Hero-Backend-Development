package org.example.encapsulation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CabBooking {

    // Encapsulated private fields
    private String customerName;
    private String pickupLocation;
    private double fare;

    // Constructor
    public CabBooking(String customerName, String pickupLocation) {
        this.customerName = customerName;
        this.pickupLocation = pickupLocation;
    }

    public void calculateFare(double distanceInKm) {
        this.fare = distanceInKm * 15;  // ₹15 per km
    }


    public void showBookingDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("Pickup Location: " + pickupLocation);
        System.out.println("Fare: ₹" + fare);
    }


}
