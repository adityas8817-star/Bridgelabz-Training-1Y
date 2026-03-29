package com.gla.exceptionhandling;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

public class CustomExceptionExample {
    static void AgeCheck(int a) throws InvalidAgeException {
        if (a < 18) {
            throw new InvalidAgeException("Invalid Age");
        }
        System.out.println("Valid Age");
    }
   public static void main() {
       try {
           AgeCheck(100);
       } catch (InvalidAgeException e) {
           System.out.println(e);
       }
    }
}