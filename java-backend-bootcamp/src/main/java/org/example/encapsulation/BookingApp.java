package org.example.encapsulation;

public class BookingApp {
    public static void main(String[] args) {
        CabBooking booking = new CabBooking("Ravi", "Airport");
        booking.setPickupLocation("Railway Station");  // Using setter method
        booking.setCustomerName("Ravi Kumar");  // Using setter method
        booking.setFare(500);  // Using setter method
        booking.showBookingDetails();

        booking.calculateFare(10.5);  // Internal logic used to set fare
        booking.showBookingDetails();


        System.out.println("Customer Name: " + booking.getCustomerName());  // Using getter method

        // booking.fare = -500; // ❌ Not allowed: fare is private (encapsulation)
    }
}
