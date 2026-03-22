package com.inheritance;

public class Teacher {
        String tName;
        String subject;
        int id;
        double salary;

        public Teacher(String tName, String subject, int id, double salary) {
            this.tName = tName;
            this.subject = subject;
            this.id = id;
            this.salary = salary;
        }
        public void teacherInfo()
        {
            System.out.println("Name of Teacher :- "+tName);
            System.out.println("Subject :- "+subject);
            System.out.println("Id :- "+id);
            System.out.println("Salary :- "+salary);
        }
        public void result(int score)
        {
            if(score>=90)
            {
                System.out.println(score + "O");
            } else if (score<90 && score>=80) {
                System.out.println(score + "A");
            }
        }
}

