package org.example.exceptions;

public class DivideExample {

    public static void main ( String[] args ) {
        int a = 10;
        int b = 0;


        try {
            int result = a / b;  // Will throw ArithmeticException
            System.out.println("1.Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("2.Error: Division by zero is not allowed." );
            e.printStackTrace();
        } finally {
            System.out.println("3.This block always executes, regardless of an exception.");
        }
    }


}