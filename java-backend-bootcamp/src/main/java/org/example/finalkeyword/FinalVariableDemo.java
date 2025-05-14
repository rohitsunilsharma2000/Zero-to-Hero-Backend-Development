package org.example.finalkeyword;

class FinalVariableDemo {
    final int MAX_VALUE = 100;

    void show() {
       //  MAX_VALUE = 200;  // ❌ Compilation error: can't change final variable
        System.out.println(MAX_VALUE);
    }

    public static void main ( String[] args ) {
        FinalVariableDemo finalVariableDemo = new FinalVariableDemo();
        finalVariableDemo.show();
    }
}
