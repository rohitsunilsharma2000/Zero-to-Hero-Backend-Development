package org.example.exceptions;

import java.util.ArrayList;
import java.util.List;

public class CabDemo {
    public static void main(String[] args) throws InvalidUserException {
        List<Cab> cabs = new ArrayList<>();
        cabs.add(new Cab("WB01A1234", true));//make it false for testing CabNotAvailableException
        cabs.add(new Cab("WB01B5678", false));

        Rider rider = new Rider("");//remove John Doe or put null for testing InvalidUserException

        RideService rideService = new RideService(cabs);//Uber
        rideService.bookCab(rider, "Park Street");
    }
}
