package org.example.fundamentals;

import java.util.Scanner;

public class UserInputFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Step 1: Get user inputs ---
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        System.out.print("Enter comment: ");
        String comment = scanner.nextLine();

        // --- Step 2: Format name ---
        name = name.trim(); // Remove extra spaces
        name = toTitleCase(name); // Convert to Title Case

        // --- Step 3: Validate and format email ---
        email = email.trim().toLowerCase(); // Clean and lowercase

        boolean isValidEmail = email.contains("@") &&
                (email.endsWith(".com") || email.endsWith(".in")) &&
                !email.contains(" ");

        // --- Step 4: Clean up comment ---

        comment = comment.trim().replace("dumb", "***"); // Remove bad words

        String[] words = comment.split("\\s+"); // Split by whitespace
        int wordCount = words.length;

        // --- Step 5: Display results ---
        if (isValidEmail) {
            System.out.println("\n--- Cleaned User Details ---");
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Comment: " + comment);
            System.out.println("Word Count: " + wordCount);
        } else {
            System.out.println("\nInvalid email address format!");
        }

        scanner.close();
    }

    // Helper function to convert string to Title Case
    private static String toTitleCase(String input) {
        StringBuilder titleCase = new StringBuilder();
        String[] parts = input.split("\\s+");

        for (String word : parts) {
            if (word.length() > 0) {
                titleCase.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    titleCase.append(word.substring(1).toLowerCase());
                }
                titleCase.append(" ");
            }
        }

        return titleCase.toString().trim(); // Remove trailing space
    }
}
