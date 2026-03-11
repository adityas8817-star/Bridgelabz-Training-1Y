package Abstraction;

public class Student extends Teacher {
    public void skills()
    {
        System.out.println("Java");
    }

    @Override
    public void info() {
        System.out.println("I am a Student to the Teacher");
    }
}
