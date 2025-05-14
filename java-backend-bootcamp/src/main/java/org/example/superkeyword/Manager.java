package org.example.superkeyword;

public class Manager extends Employee {
    String department;

    // Constructor
    Manager(String name, int id, String department) {
        super(name, id); // Call the constructor of the superclass (Employee)
        this.department = department;
    }

    void displayDetails() {
        super.displayDetails(); // Call the displayDetails method of the superclass
        System.out.println("Department: " + department);
    }
}
