package com.prowings.constructors;

public class MyClass {
    private String message;

    // Constructor
    public MyClass(String message) {
        this.message = message;
        System.out.println("Constructor called with message: " + message);
    }

    public void displayMessage() {
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass("Hello, world!");
        obj.displayMessage();
    }
}
