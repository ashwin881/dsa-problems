package com.example.entity;



public class Holder {
    private int n;

    public Holder(int n) {

        System.out.println("initialized");
        this.n = n;
    }

    public void assertSanity() {
        System.out.println("asset called");
        if (n != n) {
            System.out.println("assertion fails not safely published");
            throw new AssertionError("This statement is false.");
        }
    }
}
