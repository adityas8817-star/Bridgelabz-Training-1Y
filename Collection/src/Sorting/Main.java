package Sorting;

import java.util.LinkedList;

public class Main {
    static void main(String[] args) {
        LinkedList<Employee> e1 = new LinkedList<>();
        e1.add(new Employee(101,"Aditya",60000));
        e1.add(new Employee(109,"Kishan",70000));
        e1.add(new Employee(107,"Rishikesh",80000));
        System.out.println("List of Employee By Using 'Add()' :- " + e1);

        for (Employee p1:e1){
            System.out.println("Employee Details :- " + p1);
        }
    }
}
