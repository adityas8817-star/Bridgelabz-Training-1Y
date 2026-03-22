package com.gla.Abstract;
import java.util.function.Function;

public class StringLengthChecker {

    public static void main(String[] args) {

        String message = "Hello, this is a test message!";
        int limit = 20;
        Function<String, Integer> getLength = str -> str.length();

        int length = getLength.apply(message);

        if (length > limit) {
            System.out.println(" Message exceeds limit!");
            System.out.println("Length: " + length + ", Limit: " + limit);
        } else {
            System.out.println("Message is within limit.");
            System.out.println("Length: " + length + ", Limit: " + limit);
        }
    }
}
