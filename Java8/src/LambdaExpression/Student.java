package LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student {
    int id;
    int marks;
    String name;

    public Student(int id, int marks, String name) {
        this.id = id;
        this.marks = marks;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Student> l1 = Arrays.asList(new Student(101,80,"Amit"),
                new Student(104,95,"Abhi"),
                new Student(103,59,"Shiv"));
        System.out.println("List of Students :- " + l1);

        Collections.sort(l1,(Student a,Student b) -> a.id - b.id);
        System.out.println("This List is Sorted by ID :- " + l1);
    }
}
