package com.example.entity;

public class NewHolder {
    private Integer n;
    private Integer m;

    public  NewHolder(int value) {
        System.out.println("initialized");
        this.n = value; // Set first field
        // Simulate a delay or complex initialization to increase the chance of partial visibility
        try {
            Thread.sleep(1); // Small delay to exaggerate potential race condition
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        this.m = value; // Set second field
    }

    public void assertSanity() {
        System.out.println("assert called");
        if (n == null || m == null || !n.equals(m)) {
            System.out.println("Assertion fails: unsafe publication detected! n=" + n + ", m=" + m);
            throw new AssertionError("Unsafe publication: n and m are inconsistent!");
        }
    }
}