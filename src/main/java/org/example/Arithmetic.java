package org.example;

public class Arithmetic {

    public int add(int a, int b) {
        if (a < 0 || b < 0) {
            System.out.println("Error:Negative numbers are not allowed");
            return Integer.MIN_VALUE;
        }
        return a + b;
    }
    public int add(String a, String b) {
        return 0;
    }
}
