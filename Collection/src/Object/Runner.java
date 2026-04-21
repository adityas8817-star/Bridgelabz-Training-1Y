package Object;

import java.util.ArrayList;

public class Runner {
    public static void main() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(101, 78.23, "Vimal"));
        students.add(new Student(102, 75.50, "Amar"));
        students.add(new Student(103, 60.23, "Suman"));
        for (Object s : students) {
            System.out.println("Students Details :- " + s);
        }
    }
}
