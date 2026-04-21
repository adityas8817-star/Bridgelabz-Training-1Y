package Sorting;

public class Employee {
    int id;
    String Name;
    double Salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        Name = name;
        Salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
