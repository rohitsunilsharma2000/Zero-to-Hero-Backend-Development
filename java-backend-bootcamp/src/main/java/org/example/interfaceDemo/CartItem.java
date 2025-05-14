package org.example.interfaceDemo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class CartItem implements Displayable,Priceable{

    private String productName;
    private int quantity;
    private double unitPrice;


    @Override
    public void displayDetails () {
        System.out.println("Product Name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total Price: " + calculatePrice());
    }

    @Override
    public double calculatePrice () {
        return quantity * unitPrice;
    }
    public static void main(String[] args) {
        CartItem item = new CartItem("Wireless Mouse", 2, 499.99);

        item.displayDetails();  // From Displayable
        double total = item.calculatePrice();  // From Priceable

        System.out.println("Payable Amount: $" + total);
    }
}
