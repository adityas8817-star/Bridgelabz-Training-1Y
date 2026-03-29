package com.gla.exceptionhandling;

public class Finally {
    public static void main(String[] args) {
        try {
            int a = 20 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("...........Code Excuted........");
        }
    }
}

