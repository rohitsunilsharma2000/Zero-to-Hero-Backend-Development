package org.example.oops;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

// VegThali.java - Class definition
@AllArgsConstructor
@NoArgsConstructor
public class VegThali {
    // Properties (fields)
    String dal;              // Lentils
    String sabzi;            // Vegetable curry
    String roti;             // Indian bread
    String rice;             // Steamed rice

    String sweetDish;        // Sweet dish

    //default constructor
//    VegThali() {
//
//    }

//    // Constructor to initialize the VegThali object
//    public VegThali(String dal, String sabzi, String roti, String rice, String sweetDish) {
//        this.dal = dal;
//        this.sabzi = sabzi;
//        this.roti = roti;
//        this.rice = rice;
//        this.sweetDish = sweetDish;
//    }


    public VegThali ( String dal , String sabzi ) {
        this.dal = dal;
        this.sabzi = sabzi;
    }



    // Method to display the thali contents
    public void serveThali() {
        System.out.println("Your Veg Thali contains:");
        System.out.println("Dal: " + dal);
        System.out.println("Sabzi: " + sabzi);
        System.out.println("Roti: " + roti);
        System.out.println("Rice: " + rice);
        System.out.println("Sweet Dish: " + sweetDish);
    }

    public void serveThaliTypeOne() {
        System.out.println("Your Veg Thali contains:");
        System.out.println("Dal: " + dal);

    }

    public static void main(String[] args) {
        // Creating an object (instance) of VegThali
        VegThali thaliTypeOne = new VegThali("Tadka Dal", "Aloo Gobi");
        VegThali myThali = new VegThali("Tadka Dal", "Aloo Gobi", "Chapati", "Steamed Rice", "Gulab Jamun");

        // Calling the method to display the thali contents
      //  myThali.serveThali();
        thaliTypeOne.serveThaliTypeOne();
    }
}
