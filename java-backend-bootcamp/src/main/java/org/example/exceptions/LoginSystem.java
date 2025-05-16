package org.example.exceptions;

public class LoginSystem {

    public static void login(String username) throws UserNotFoundException {
        if (!username.equals("admin")) {
            throw new UserNotFoundException("User '" + username + "' not found.");
        }
        System.out.println("✅ Login successful!");
    }

    public static void main ( String[] args ) {
        try {
            login("guest89");  // This will throw the custom exception
        } catch (UserNotFoundException e) {
            System.out.println("❌ Error: " + e.getMessage());
        } finally {
            System.out.println("🔐 Login attempt completed.");
        }
    }
}
