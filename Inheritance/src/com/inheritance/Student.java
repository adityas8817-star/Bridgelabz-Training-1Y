package com.inheritance;

public class Student extends Teacher {
    String sName;
    int rollNo;
    String course;

    public Student(String sName, int rollNo, String course,String tName, String subject, int id, double salary) {
        super(tName,subject,id,salary);
        this.sName = sName;
        this.rollNo = rollNo;
        this.course = course;
    }

    public void studentInfo()
    {
        super.result(85);
        super.teacherInfo();
        System.out.println("Name of the Student :- "+sName);
        System.out.println("Roll no :- "+rollNo);
        System.out.println("Course :- "+course);
    }
}
