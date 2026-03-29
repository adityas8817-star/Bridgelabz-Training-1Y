package com.gla.exceptionhandling;

public class AgeCheck{
    static void ageChecker(int a)
    {
        if(a<18)
        {
            throw new ArithmeticException("Invalid Age");
        }
            System.out.println("Valid Age");
    }
        public static void main(String[] args)
        {
             ageChecker(20);
        }
}

