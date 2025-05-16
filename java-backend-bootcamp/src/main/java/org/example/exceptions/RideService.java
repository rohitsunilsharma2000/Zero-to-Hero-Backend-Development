package org.example.exceptions;

import java.util.List;

public class RideService {

    private List<Cab> availableCabs;

    public RideService( List<Cab> availableCabs) {
        this.availableCabs = availableCabs;
    }

    public void bookCab(Rider rider, String pickupLocation) {
        try {
            if (rider == null || rider.getName() == null || rider.getName().isEmpty()) {
                throw new InvalidUserException("Rider not found.");
            }

            Cab cab = findNearestAvailableCab(pickupLocation);
            if (cab == null) {
                throw new CabNotAvailableException("No cab available nearby.");
            }

            cab.setAvailable(false);
            System.out.println("Cab booked successfully for " + rider.getName());

        } catch (InvalidUserException | CabNotAvailableException e) {
            System.err.println("Booking failed: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        }
    }

    private Cab findNearestAvailableCab(String pickupLocation) {
        // Dummy search logic
        return availableCabs.stream()
                            .filter(Cab::isAvailable)
                            .findFirst()
                            .orElse(null);
    }
}
