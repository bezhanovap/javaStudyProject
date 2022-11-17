package com.avenue.java.spb.group2.lesson16.stream_api;

import com.avenue.java.spb.group2.lesson16.Speciality;

public class Specialist {
    // Поля
    private String name;
    private Integer salary;
    private Speciality speciality;

    // Конструктор

    public Specialist(String name, Integer salary, Speciality speciality) {
        this.name = name;
        this.salary = salary;
        this.speciality = speciality;
    }


    // Методы


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }
}
