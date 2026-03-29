package com.gla.exceptionhandling;

public class ThrowVsThrows {
    static void ageChecker(int a) throws ArithmeticException, NullPointerException {
        if (a < 18) {
            throw new ArithmeticException("Invalid Age");
        }
        System.out.println("Valid Age");
    }

    public static void main(String[] args) {
        try {
            ageChecker(100);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
