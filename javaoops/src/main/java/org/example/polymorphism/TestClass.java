package org.example.polymorphism;

public class TestClass {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.add(1,2);
        c.add(1.0,6.7);
        c.add(1.0,3.3,7.8);
    }
}
