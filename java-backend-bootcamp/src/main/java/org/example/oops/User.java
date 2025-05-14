package org.example.oops;

//✅ 1. Abstraction – Define common blueprints
abstract class User {
    protected String name;
    protected String memberId;

    public User(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    // Abstract method to be implemented differently
    public abstract void showUserType();
}
