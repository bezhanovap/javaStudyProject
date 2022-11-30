package com.avenue.java.spb.group2.lesson20;

import java.util.Date;

public class Student {
    private int id;
    private String firstName;
    private String secondName;
    private String teacherName;
    private double markAv;
    private int age;

    public Student(int id, String firstName, String secondName, String teacherName, double markAv, int age) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.teacherName = teacherName;
        this.markAv = markAv;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public double getMarkAv() {
        return markAv;
    }

    public void setMarkAv(double markAv) {
        this.markAv = markAv;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", markAv=" + markAv +
                ", age=" + age +
                '}';
    }
}
