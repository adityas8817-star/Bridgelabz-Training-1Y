package Abstraction;

public class Runner {
    static void main() {
        Student s1=new Student();
        s1.info();
        s1.skills();
        s1.position();
        System.out.println("------------------------------------------------------");
        Teacher t1=new Student();
        t1.info();
        t1.position();
    }
}
